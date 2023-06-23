package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Article;


public interface ArticleRepository extends JpaRepository<Article, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
        @Override
        public <S extends Article> S saveAndFlush(S entity);
}
