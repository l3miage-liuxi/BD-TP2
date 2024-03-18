package fr.uga.l3miage.tp2.exo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ClubSportif {
    @Id
    public long id;

    public String nom;

    public String description;
    @ManyToMany(mappedBy = "clubsportifs")
    public Set<Etudiant> etudiants = new HashSet<>();
}
