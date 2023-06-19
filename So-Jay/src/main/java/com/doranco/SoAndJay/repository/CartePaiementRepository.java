package com.doranco.SoAndJay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.CartePaiement;

public interface CartePaiementRepository extends JpaRepository<CartePaiement, Long> {
    // Méthodes spécifiques à ajouter si nécessaire
}
