package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    public long id;

    public String rue;

    public String numero;

    public String codePostal;

    public String ville;

    @OneToOne(mappedBy = "adresse")
    public Client client;
}
