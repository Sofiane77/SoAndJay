package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.Categorie;

public interface CategorieService {
    Categorie getCategorieById(Long id);
    List<Categorie> getAllCategories();
    Categorie createCategorie(Categorie categorie);
    Categorie updateCategorie(Categorie categorie);
    void deleteCategorie(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}
