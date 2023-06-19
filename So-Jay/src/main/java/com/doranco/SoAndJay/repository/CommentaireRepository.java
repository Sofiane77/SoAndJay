package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

