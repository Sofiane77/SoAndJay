package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

