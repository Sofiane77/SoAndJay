package com.doranco.SoAndJay.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doranco.SoAndJay.entities.ArticlePanier;
import com.doranco.SoAndJay.entities.Utilisateur;

@Repository
public interface ArticlePanierRepository extends JpaRepository<ArticlePanier, Long> {
    List<ArticlePanier> findByUtilisateurId(Long utilisateurId);

    List<ArticlePanier> findByUtilisateur(Utilisateur utilisateur);

    List<ArticlePanier> findByTotalGreaterThan(double total);

    List<ArticlePanier> findByDateCreationBetween(Date debut, Date fin);

    // List<Panier> findByStatut(StatutPanier statut);(toujours pas de statut)
}
