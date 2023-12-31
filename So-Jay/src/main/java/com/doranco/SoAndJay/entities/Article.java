package com.doranco.SoAndJay.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String description;

    private double prix;

    private double remise;

    private int stock;

    private boolean isVendable;

    private String photos; // Chemin vers le dossier du disque dur contenant les photos

    private String videos; // Chemin vers le dossier du disque dur contenant les vidéos

    @OneToMany(mappedBy = "article")
    private List<Commentaire> commentaires;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Article() {
    }

    public Article(String nom, String description, double prix, double remise, int stock, boolean isVendable, String photos, String videos) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.remise = remise;
        this.stock = stock;
        this.isVendable = isVendable;
        this.photos = photos;
        this.videos = videos;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isVendable() {
        return isVendable;
    }

    public void setVendable(boolean vendable) {
        isVendable = vendable;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
