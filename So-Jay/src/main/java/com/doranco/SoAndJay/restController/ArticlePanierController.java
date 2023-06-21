package com.doranco.SoAndJay.restController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doranco.SoAndJay.entities.ArticlePanier;
import com.doranco.SoAndJay.services.ArticlePanierService;

@RestController
@RequestMapping("/api/articlepanier")
public class ArticlePanierController {

    private final ArticlePanierService articlePanierService;

    public ArticlePanierController(ArticlePanierService articlePanierService) {
        this.articlePanierService = articlePanierService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticlePanier> getArticlePanierById(@PathVariable Long id) {
        ArticlePanier articlePanier = articlePanierService.getArticlePanierById(id);
        return ResponseEntity.ok(articlePanier);
    }

    @PostMapping
    public ResponseEntity<ArticlePanier> createArticlePanier(@RequestBody ArticlePanier articlePanier) {
        ArticlePanier newArticlePanier = articlePanierService.createArticlePanier(articlePanier);
        return ResponseEntity.status(HttpStatus.CREATED).body(newArticlePanier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticlePanier> updateArticlePanier(@PathVariable Long id, @RequestBody ArticlePanier articlePanier) {
        ArticlePanier updatedArticlePanier = articlePanierService.updateArticlePanier(articlePanier);
        return ResponseEntity.ok(updatedArticlePanier);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticlePanier(@PathVariable Long id) {
        articlePanierService.deleteArticlePanier(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public ResponseEntity<List<ArticlePanier>> getArticlePaniersByUtilisateur(@PathVariable Long utilisateurId) {
        List<ArticlePanier> articlePaniers = articlePanierService.getArticlePaniersByUtilisateur(utilisateurId);
        return ResponseEntity.ok(articlePaniers);
    }
}
