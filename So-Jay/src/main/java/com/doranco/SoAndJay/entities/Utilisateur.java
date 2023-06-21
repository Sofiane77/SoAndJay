package com.doranco.SoAndJay.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Utilisateur")
@NoArgsConstructor
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    private boolean isActif;

    @Enumerated(EnumType.STRING)
    private Profil profil;

    private String email;

    private String password;

    private String telephone;

    @OneToMany(mappedBy = "utilisateur")
    private List<Adresse> adresses;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "utilisateur")
    private List<ArticlePanier> panier;

    public Utilisateur(String nom, String prenom, LocalDate dateNaissance, boolean isActif, Profil profil, String email, String password, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.isActif = isActif;
        this.profil = profil;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

}
