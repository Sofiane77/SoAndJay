package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}

