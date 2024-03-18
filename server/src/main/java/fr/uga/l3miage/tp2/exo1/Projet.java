package fr.uga.l3miage.tp2.exo1;

import fr.uga.l3miage.tp2.exo1.Developer_miage;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Projet {
    @Id
    public long id;

    public String name;

    public String description;

    @ManyToMany
    @JoinTable(name = "developer_miage_project",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "lastname")
    )

    public Set<Developer_miage> developer_Miages = new HashSet<>();
}
