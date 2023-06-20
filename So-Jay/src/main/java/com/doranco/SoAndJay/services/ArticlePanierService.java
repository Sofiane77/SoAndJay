package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.ArticlePanier;

public interface ArticlePanierService {
    ArticlePanier getArticlePanierById(Long id);
    List<ArticlePanier> getAllArticlesPanier();
    ArticlePanier createArticlePanier(ArticlePanier articlePanier);
    ArticlePanier updateArticlePanier(ArticlePanier articlePanier);
    void deleteArticlePanier(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire

    List<ArticlePanier> getArticlePaniersByUtilisateur(Long utilisateurId);

}

