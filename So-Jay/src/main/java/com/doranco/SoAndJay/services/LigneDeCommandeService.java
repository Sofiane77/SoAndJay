package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.LigneDeCommande;

public interface LigneDeCommandeService {
    LigneDeCommande getLigneDeCommandeById(Long id);
    List<LigneDeCommande> getAllLignesDeCommande();
    LigneDeCommande createLigneDeCommande(LigneDeCommande ligneDeCommande);
    LigneDeCommande updateLigneDeCommande(LigneDeCommande ligneDeCommande);
    void deleteLigneDeCommande(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}

