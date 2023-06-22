package com.doranco.SoAndJay.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LigneDeCommande")
@NoArgsConstructor
@Data
public class LigneDeCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantite;

    private double prixUnitaire;

    private double remiseArticle;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @OneToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public LigneDeCommande(int quantite, double prixUnitaire, double remiseArticle) {
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.remiseArticle = remiseArticle;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getRemiseArticle() {
        return remiseArticle;
    }

    public void setRemiseArticle(double remiseArticle) {
        this.remiseArticle = remiseArticle;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
