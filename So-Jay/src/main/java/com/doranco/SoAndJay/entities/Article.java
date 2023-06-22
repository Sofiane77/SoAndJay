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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Article")
@NoArgsConstructor
@Data
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

}
