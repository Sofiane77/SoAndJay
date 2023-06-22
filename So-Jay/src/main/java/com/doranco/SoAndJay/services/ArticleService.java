package com.doranco.SoAndJay.services;

import com.doranco.SoAndJay.entities.Article;
import com.doranco.SoAndJay.repository.ArticleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }


    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article updateArticle(Long id, Article updatedArticle) {
        Optional<Article> existingArticle = articleRepository.findById(id);

        if (existingArticle.isPresent()) {
            Article article = existingArticle.get();
            article.setNom(updatedArticle.getNom());
            article.setDescription(updatedArticle.getDescription());
            article.setPrix(updatedArticle.getPrix());
            article.setRemise(updatedArticle.getRemise());
            article.setStock(updatedArticle.getStock());
            article.setVendable(updatedArticle.isVendable());
            article.setPhotos(updatedArticle.getPhotos());
            article.setVideos(updatedArticle.getVideos());

            return articleRepository.save(article);
        }

        return null;
    }

    public boolean deleteArticle(Long id) {
        if (articleRepository.existsById(id)) {
            articleRepository.deleteById(id);
            return true;
        }

        return false;
    }
    // Autres méthodes spécifiques à ajouter si nécessaire
}
