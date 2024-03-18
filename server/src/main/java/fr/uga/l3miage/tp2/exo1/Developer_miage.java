package fr.uga.l3miage.tp2.exo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Developer_miage {
    @Id
    public String lastname;

    public String firstname;

    public String email;
    @ManyToMany(mappedBy = "developer_miage")
    public Set<Projet> projects = new HashSet<>();
}
