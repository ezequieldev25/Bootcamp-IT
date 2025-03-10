package com.backend.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults( level = AccessLevel.PRIVATE)
public class CharacterEntity implements Serializable {

    private static final Long ID = 1L;

    String name;
    Integer height;
    Integer mass;
    @JsonProperty("hair_color")
    String hairColor;
    @JsonProperty("skin_color")
    String skinColor;
    @JsonProperty("eye_color")
    String eyeColor;
    @JsonProperty("birth_year")
    String birthYear;
    String gender;
    String homeworld;
    String species;
}
