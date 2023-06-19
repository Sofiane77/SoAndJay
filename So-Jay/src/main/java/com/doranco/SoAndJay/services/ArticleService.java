package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.Article;

public interface ArticleService {
    Article getArticleById(Long id);
    List<Article> getAllArticles();
    Article createArticle(Article article);
    Article updateArticle(Article article);
    void deleteArticle(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}

