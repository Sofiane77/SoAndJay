package com.doranco.SoAndJay.services;

import java.util.List;

import com.doranco.SoAndJay.entities.Commentaire;

public interface CommentaireService {
    Commentaire getCommentaireById(Long id);
    List<Commentaire> getAllCommentaires();
    Commentaire createCommentaire(Commentaire commentaire);
    Commentaire updateCommentaire(Commentaire commentaire);
    void deleteCommentaire(Long id);
    // Autres méthodes spécifiques à ajouter si nécessaire
}
