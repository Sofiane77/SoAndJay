package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}
