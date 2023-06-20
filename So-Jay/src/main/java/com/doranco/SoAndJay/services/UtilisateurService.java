package com.doranco.SoAndJay.services;

import com.doranco.SoAndJay.entities.Utilisateur;
import java.util.List;

public interface UtilisateurService {
    Utilisateur getUtilisateurById(Long id);
    List<Utilisateur> getAllUtilisateurs();
    Utilisateur createUtilisateur(Utilisateur utilisateur);
    Utilisateur updateUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateur(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}
