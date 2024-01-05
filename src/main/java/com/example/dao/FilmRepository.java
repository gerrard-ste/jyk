package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Film;
@RepositoryRestResource

public interface FilmRepository extends JpaRepository<Film, Long>{

}
