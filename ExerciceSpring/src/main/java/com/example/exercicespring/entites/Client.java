package com.example.exercicespring.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Client {

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CompteBancaire> listeComptes = new ArrayList<>();


    @OneToOne
    private Banque banquee;

    public void addCompteBancaire(CompteBancaire compteBancaire) {
        listeComptes.add(compteBancaire);
        compteBancaire.setProprietaire(this);
    }

    public void removeCompteBancaire(CompteBancaire compteBancaire) {
        listeComptes.remove(compteBancaire);
        compteBancaire.setProprietaire(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Client client = (Client) o;
        return id != null && Objects.equals(id, client.id);
    }

    public List<CompteBancaire> getListeComptes() {
        return this.listeComptes;
    }


    public void setBanque(Banque banque) {
    }
}
