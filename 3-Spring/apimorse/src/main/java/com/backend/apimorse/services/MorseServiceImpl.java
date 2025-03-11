package com.backend.apimorse.services;

import org.springframework.stereotype.Service;

@Service
public class MorseServiceImpl implements MorseService {
    private final static String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // A-I
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", // J-R
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", // S-1
            "..--", "...--", "....-", ".....", "-....", "-....", "--...", "---..", "----.", "-----", // 2-0
    };
    private final static String abecedary = "abcdefghijklmnopqrstuvwxyz1234567890";

    @Override
    public String translateToSpain(String morse) {
        StringBuilder textInSpain = new StringBuilder();

        for(int i = 0; i < morse.length(); i++)
            textInSpain.append(abecedary.charAt(morse.indexOf(i)));

        return textInSpain.toString();
    }

    @Override
    public String translateSpainToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();

        for(int i = 0; i < text.length(); i++)
            morseCode.append(morseCodes[abecedary.indexOf(text.charAt(i))]);

        return morseCode.toString();
    }
}