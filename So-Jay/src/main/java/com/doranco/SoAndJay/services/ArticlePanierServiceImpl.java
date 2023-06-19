package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.ArticlePanier;
import com.doranco.SoAndJay.repository.ArticlePanierRepository;

@Service
public class ArticlePanierServiceImpl implements ArticlePanierService {

    @Autowired
    private ArticlePanierRepository articlePanierRepository;

    @Override
    public ArticlePanier getArticlePanierById(Long id) {
        return articlePanierRepository.findById(id).orElse(null);
    }

    @Override
    public List<ArticlePanier> getAllArticlesPanier() {
        return articlePanierRepository.findAll();
    }

    @Override
    public ArticlePanier createArticlePanier(ArticlePanier articlePanier) {
        return articlePanierRepository.save(articlePanier);
    }

    @Override
    public ArticlePanier updateArticlePanier(ArticlePanier articlePanier) {
        return articlePanierRepository.save(articlePanier);
    }

    @Override
    public void deleteArticlePanier(Long id) {
        articlePanierRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}

