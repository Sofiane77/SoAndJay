package com.doranco.SoAndJay.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    private Date dateCreation;

    private Date dateLivraison;

    private double tataleRemise;

    private double fraisExpedition;

    private double totalGeneral;

    @OneToOne
    @JoinColumn(name = "adresseFacturation_id")
    private Adresse adresseFacturation;

    @OneToOne
    @JoinColumn(name = "adresseLivraison_id")
    private Adresse adresseLivraison;

    @OneToOne
    @JoinColumn(name = "cartePaiementDefaut_id")
    private CartePaiement cartePaiementDefaut;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "commande")
    private List<LigneDeCommande> lignesCommande;

    public Commande() {
    }

    public Commande(String numero, Date dateCreation, Date dateLivraison, double tataleRemise, double fraisExpedition, double totalGeneral) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.dateLivraison = dateLivraison;
        this.tataleRemise = tataleRemise;
        this.fraisExpedition = fraisExpedition;
        this.totalGeneral = totalGeneral;
    }

    // Getters and setters

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

    public double getTataleRemise() {
        return tataleRemise;
    }

    public void setTataleRemise(double tataleRemise) {
        this.tataleRemise = tataleRemise;
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
}
