package com.doranco.SoAndJay.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Commande;
import com.doranco.SoAndJay.entities.Utilisateur;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // Méthodes spécifiques à ajouter si

    List<Commande> findByUtilisateur(Utilisateur utilisateur);

    List<Commande> findByDateBetween(Date debut, Date fin);

    // List<Commande> findByStatut(StatutCommande statut);  (Peut etre ajouter le statut  pour savoir si la commande est en cours ou en livraison etc)

    List<Commande> findByTotalGreaterThan(double total);

}

