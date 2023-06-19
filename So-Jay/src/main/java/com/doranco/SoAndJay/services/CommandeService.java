package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.Commande;

public interface CommandeService {
    Commande getCommandeById(Long id);
    List<Commande> getAllCommandes();
    Commande createCommande(Commande commande);
    Commande updateCommande(Commande commande);
    void deleteCommande(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}
