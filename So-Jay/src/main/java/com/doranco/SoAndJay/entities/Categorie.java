package com.doranco.SoAndJay.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double remise;
    private boolean isRemiseCumulable;
    private String photo;

    @ManyToMany
    private List<Article> articles;

    public Categorie() {
    }

    public Categorie(String nom, double remise, boolean isRemiseCumulable, String photo, List<Article> articles) {
        this.nom = nom;
        this.remise = remise;
        this.isRemiseCumulable = isRemiseCumulable;
        this.photo = photo;
        this.articles = articles;
    }

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

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public boolean isRemiseCumulable() {
        return isRemiseCumulable;
    }

    public void setRemiseCumulable(boolean isRemiseCumulable) {
        this.isRemiseCumulable = isRemiseCumulable;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }


    // Getters and setters




}
