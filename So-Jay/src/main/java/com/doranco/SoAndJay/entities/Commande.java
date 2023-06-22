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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Commande")
@NoArgsConstructor
@Data
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


    public Commande(String numero, Date dateCreation, Date dateLivraison, double tataleRemise, double fraisExpedition, double totalGeneral) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.dateLivraison = dateLivraison;
        this.tataleRemise = tataleRemise;
        this.fraisExpedition = fraisExpedition;
        this.totalGeneral = totalGeneral;
    }


}
