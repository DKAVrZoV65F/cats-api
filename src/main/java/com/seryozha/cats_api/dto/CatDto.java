package com.seryozha.cats_api.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDto {

    private String name;
    private LocalDate birthDay;
}
