package com.projetocamadas.projeto.repositories;

import com.projetocamadas.projeto.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
