package com.doranco.SoAndJay.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "CartePaiement")
public class CartePaiement implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProprietaire;
    private String prenomProprietaire;
    private String numero;
    private Date dateFinValidite;
    private String cryptogramme;

    @ManyToOne
    private Utilisateur utilisateur;

    // Constructeurs
    public CartePaiement() {
    }

    public CartePaiement(String nomProprietaire, String prenomProprietaire, String numero, Date dateFinValidite,
            String cryptogramme, Utilisateur utilisateur) {
        this.nomProprietaire = nomProprietaire;
        this.prenomProprietaire = prenomProprietaire;
        this.numero = numero;
        this.dateFinValidite = dateFinValidite;
        this.cryptogramme = cryptogramme;
        this.utilisateur = utilisateur;
    }



    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateFinValidite() {
        return dateFinValidite;
    }

    public void setDateFinValidite(Date dateFinValidite) {
        this.dateFinValidite = dateFinValidite;
    }

    public String getCryptogramme() {
        return cryptogramme;
    }

    public void setCryptogramme(String cryptogramme) {
        this.cryptogramme = cryptogramme;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    // Autres méthodes si nécessaire
}
