package com.doranco.SoAndJay.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private boolean isActif;
    private String profil;
    private String email;
    private String password;
    private String telephone;

    @OneToMany(mappedBy = "utilisateur")
    private List<Adresse> adresses;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "utilisateur")
    private List<CartePaiement> cartesDePaiement;

    @OneToMany(mappedBy = "utilisateur")
    private List<Commentaire> commentaires;

    @OneToMany(mappedBy = "utilisateur")
    private List<ArticlePanier> panier;

    // Constructeurs
    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, Date dateNaissance, boolean isActif, String profil,
            String email, String password, String telephone, List<Adresse> adresses, List<Commande> commandes,
            List<CartePaiement> cartesDePaiement, List<Commentaire> commentaires, List<ArticlePanier> panier) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.isActif = isActif;
        this.profil = profil;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresses = adresses;
        this.commandes = commandes;
        this.cartesDePaiement = cartesDePaiement;
        this.commentaires = commentaires;
        this.panier = panier;
    }



    // Getters et Setters
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isActif() {
        return isActif;
    }

    public void setActif(boolean actif) {
        isActif = actif;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public List<CartePaiement> getCartesDePaiement() {
        return cartesDePaiement;
    }

    public void setCartesDePaiement(List<CartePaiement> cartesDePaiement) {
        this.cartesDePaiement = cartesDePaiement;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<ArticlePanier> getPanier() {
        return panier;
    }

    public void setPanier(List<ArticlePanier> panier) {
        this.panier = panier;
    }

    // Autres méthodes si nécessaire
}
