package com.doranco.SoAndJay.entities;



import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LigneDeCommande")
public class LigneDeCommande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantite;
    private double prixUnitaire;
    private double remiseArticle;

    @OneToOne
    private Article article;

    @ManyToOne
    private Commande commande;

    // Constructeurs
    public LigneDeCommande() {
    }

    public LigneDeCommande(int quantite, double prixUnitaire, double remiseArticle, Article article,
            Commande commande) {
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.remiseArticle = remiseArticle;
        this.article = article;
        this.commande = commande;
    }



    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getRemiseArticle() {
        return remiseArticle;
    }

    public void setRemiseArticle(double remiseArticle) {
        this.remiseArticle = remiseArticle;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    // Autres méthodes si nécessaire
}
