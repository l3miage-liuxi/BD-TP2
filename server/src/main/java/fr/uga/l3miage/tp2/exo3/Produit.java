package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;

@Entity
public class Produit {
    @Id
    public long id;

    public String nom;

    public String prix;

    public int quantite;

    @ManyToOne
    @JoinColumn(name = "apourCategorie")
    public CategorieDeProduit categorieDeProduit;

    @ManyToOne
    @JoinColumn(name = "ApourProduits")
    public Commande commande;
}
