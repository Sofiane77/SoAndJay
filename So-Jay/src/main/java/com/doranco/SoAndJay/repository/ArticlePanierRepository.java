package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.ArticlePanier;

public interface ArticlePanierRepository extends JpaRepository<ArticlePanier, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

