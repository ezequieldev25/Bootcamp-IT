package com.backend.api.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults( level = AccessLevel.PRIVATE)
public class CharacterDTO {

    String name;
    Integer height;
    Integer mass;
    String gender;
    String homeworld;
    String species;
    String hairColor;
}
