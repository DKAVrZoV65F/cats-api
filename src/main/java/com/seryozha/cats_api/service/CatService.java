package com.seryozha.cats_api.service;

import com.seryozha.cats_api.dto.CatDto;
import com.seryozha.cats_api.entity.Cat;
import com.seryozha.cats_api.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(@RequestBody CatDto catDto) {
        Cat cat = new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthDay())
                .setCreatedAt(LocalDateTime.now());


        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
