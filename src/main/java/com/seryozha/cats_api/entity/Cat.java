package com.seryozha.cats_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Cat {

    @Id
    private String id;

    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;
}
