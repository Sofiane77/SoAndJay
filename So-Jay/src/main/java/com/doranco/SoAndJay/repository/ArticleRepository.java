package com.doranco.SoAndJay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Article;
import com.doranco.SoAndJay.entities.Categorie;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // Méthodes spécifiques à ajouter si nécessaire

    List<Article> findByPrixGreaterThan(double prix);

    List<Article> findByCategorie(Categorie categorie);

    List<Article> findByNomContaining(String nom);

    List<Article> findByStockGreaterThan(int stock);

}
