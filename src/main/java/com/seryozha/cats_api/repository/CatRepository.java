package com.seryozha.cats_api.repository;

import com.seryozha.cats_api.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}
