package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.CartePaiement;

public interface CartePaiementService {
    CartePaiement getCartePaiementById(Long id);
    List<CartePaiement> getAllCartesPaiement();
    CartePaiement createCartePaiement(CartePaiement cartePaiement);
    CartePaiement updateCartePaiement(CartePaiement cartePaiement);
    void deleteCartePaiement(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}
