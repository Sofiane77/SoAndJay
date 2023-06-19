package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.LigneDeCommande;

public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

