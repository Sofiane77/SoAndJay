package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

