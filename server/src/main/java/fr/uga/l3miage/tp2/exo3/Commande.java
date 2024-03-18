package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Commande {
    @Id
    public long id;

    public Date date;

    public double montantToatal;

    @ManyToOne
    @JoinColumn(name = "commandespourClient")
    public Client client;

    @OneToMany(mappedBy = "produits")
    public Set<Produit> produits;
}
