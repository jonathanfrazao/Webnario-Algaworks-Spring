package com.algaworks.bibliotecadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.bibliotecadigital.model.Livro;

@Repository
public interface Livros extends JpaRepository<Livro, Long> {

}
