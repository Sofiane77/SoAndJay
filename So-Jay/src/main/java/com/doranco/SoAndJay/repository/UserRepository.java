package com.doranco.SoAndJay.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doranco.SoAndJay.entities.Profil;
import com.doranco.SoAndJay.entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Long> {
    // Méthodes spécifiques à ajouter si nécessaire

    Utilisateur findByEmail(String email);

    List<Utilisateur> findByNomContaining(String nom);

    List<Utilisateur> findByProfil(Profil profil);

    List<Utilisateur> findByDateInscriptionBetween(Date debut, Date fin);
}

