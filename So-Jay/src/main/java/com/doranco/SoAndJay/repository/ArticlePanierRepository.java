package com.doranco.SoAndJay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.SoAndJay.entities.ArticlePanier;

@Repository
public interface ArticlePanierRepository extends JpaRepository<ArticlePanier, Long> {
    List<ArticlePanier> findByUtilisateurId(Long utilisateurId);
}
