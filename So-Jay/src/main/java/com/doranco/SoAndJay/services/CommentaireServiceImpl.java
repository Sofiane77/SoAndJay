package com.doranco.SoAndJay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.SoAndJay.entities.Commentaire;
import com.doranco.SoAndJay.repository.CommentaireRepository;

@Service
public class CommentaireServiceImpl implements CommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;

    @Override
    public Commentaire getCommentaireById(Long id) {
        return commentaireRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commentaire> getAllCommentaires() {
        return commentaireRepository.findAll();
    }

    @Override
    public Commentaire createCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public Commentaire updateCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public void deleteCommentaire(Long id) {
        commentaireRepository.deleteById(id);
    }

    // Autres méthodes spécifiques à ajouter si nécessaire
}

