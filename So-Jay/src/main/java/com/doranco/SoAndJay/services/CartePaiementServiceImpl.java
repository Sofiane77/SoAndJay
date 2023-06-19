package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.CartePaiement;
import com.doranco.SoAndJay.repository.CartePaiementRepository;

@Service
public class CartePaiementServiceImpl implements CartePaiementService {

    @Autowired
    private CartePaiementRepository cartePaiementRepository;

    @Override
    public CartePaiement getCartePaiementById(Long id) {
        return cartePaiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<CartePaiement> getAllCartesPaiement() {
        return cartePaiementRepository.findAll();
    }

    @Override
    public CartePaiement createCartePaiement(CartePaiement cartePaiement) {
        return cartePaiementRepository.save(cartePaiement);
    }

    @Override
    public CartePaiement updateCartePaiement(CartePaiement cartePaiement) {
        return cartePaiementRepository.save(cartePaiement);
    }

    @Override
    public void deleteCartePaiement(Long id) {
        cartePaiementRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}
