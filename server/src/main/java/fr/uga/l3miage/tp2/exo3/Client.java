package fr.uga.l3miage.tp2.exo3;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    public long id;

    public String nom;

    public String email;

    @OneToOne
    @JoinColumn(name = "Apouradresse")
    public Adresse adresse;

    @OneToMany(mappedBy = " commandes")
    public Set<Commande> commandes;
}
