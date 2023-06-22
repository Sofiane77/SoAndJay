package com.doranco.SoAndJay.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CartePaiement")
@NoArgsConstructor
@Data
public class CartePaiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomProprietaire;

    private String prenomProprietaire;

    private String numero; // crypté

    private String dateFinValidite;

    private String cryptogramme; // crypté

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;


    // Construtueur

    public CartePaiement(String nomProprietaire, String prenomProprietaire, String numero, String dateFinValidite, String cryptogramme) {
        this.nomProprietaire = nomProprietaire;
        this.prenomProprietaire = prenomProprietaire;
        this.numero = numero;
        this.dateFinValidite = dateFinValidite;
        this.cryptogramme = cryptogramme;
    }


}




