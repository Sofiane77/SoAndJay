package com.doranco.SoAndJay.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private Date dateCreation;
    private Date dateLivraison;
    private double totaleRemise;
    private double fraisExpedition;
    private double totalGeneral;

    @ManyToOne
    private Adresse adresseFacturation;

    @ManyToOne
    private Adresse adresseLivraison;

    @ManyToOne
    private CartePaiement cartePaiementDefaut;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "commande")
    private List<LigneDeCommande> lignesCommande;

    // Constructeurs
    public Commande() {
    }

    public Commande(String numero, Date dateCreation, Date dateLivraison, double totaleRemise, double fraisExpedition,
            double totalGeneral, Adresse adresseFacturation, Adresse adresseLivraison,
            CartePaiement cartePaiementDefaut, Utilisateur utilisateur, List<LigneDeCommande> lignesCommande) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.dateLivraison = dateLivraison;
        this.totaleRemise = totaleRemise;
        this.fraisExpedition = fraisExpedition;
        this.totalGeneral = totalGeneral;
        this.adresseFacturation = adresseFacturation;
        this.adresseLivraison = adresseLivraison;
        this.cartePaiementDefaut = cartePaiementDefaut;
        this.utilisateur = utilisateur;
        this.lignesCommande = lignesCommande;
    }



    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public double getTotaleRemise() {
        return totaleRemise;
    }

    public void setTotaleRemise(double totaleRemise) {
        this.totaleRemise = totaleRemise;
    }

    public double getFraisExpedition() {
        return fraisExpedition;
    }

    public void setFraisExpedition(double fraisExpedition) {
        this.fraisExpedition = fraisExpedition;
    }

    public double getTotalGeneral() {
        return totalGeneral;
    }

    public void setTotalGeneral(double totalGeneral) {
        this.totalGeneral = totalGeneral;
    }

    public Adresse getAdresseFacturation() {
        return adresseFacturation;
    }

    public void setAdresseFacturation(Adresse adresseFacturation) {
        this.adresseFacturation = adresseFacturation;
    }

    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(Adresse adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public CartePaiement getCartePaiementDefaut() {
        return cartePaiementDefaut;
    }

    public void setCartePaiementDefaut(CartePaiement cartePaiementDefaut) {
        this.cartePaiementDefaut = cartePaiementDefaut;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<LigneDeCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(List<LigneDeCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }

    // Autres méthodes si nécessaire
}
