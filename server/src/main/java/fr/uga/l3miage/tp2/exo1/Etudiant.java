package fr.uga.l3miage.tp2.exo1;

import fr.uga.l3miage.tp2.exo1.ClubSportif;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    public long agalan;

    public String nom;

    public String email;

    @ManyToMany
    @JoinTable(name = "ClubsportifPourEtudiant",
            joinColumns = @JoinColumn(name = "agalan"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    public Set<ClubSportif> clubSportifs = new HashSet<>();
}
