package com.doranco.SoAndJay.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Article")
public class Article implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private double prix;
    private String categorie;

    @OneToMany(mappedBy = "article")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "article")
    private List<LigneDeCommande> lignesCommande;

    @OneToMany(mappedBy = "article")
    private List<ArticlePanier> panier;

    // Constructeurs
    public Article() {
    }

    public Article(String titre, String description, double prix, String categorie, List<Commentaire> commentaires,
            List<LigneDeCommande> lignesCommande, List<ArticlePanier> panier) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.categorie = categorie;
        this.commentaires = commentaires;
        this.lignesCommande = lignesCommande;
        this.panier = panier;
    }



    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<LigneDeCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(List<LigneDeCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }

    public List<ArticlePanier> getPanier() {
        return panier;
    }

    public void setPanier(List<ArticlePanier> panier) {
        this.panier = panier;
    }

    // Autres méthodes si nécessaire
}
