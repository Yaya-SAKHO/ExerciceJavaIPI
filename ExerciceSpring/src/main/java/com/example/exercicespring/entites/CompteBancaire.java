package com.example.exercicespring.entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "comptes_bancaires")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CompteBancaire {

    @Id
    @Column(name = "id_compte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private double solde;

    @ManyToOne
    private Client proprietaire;

    @ManyToOne
    private Banque banque;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CompteBancaire compte = (CompteBancaire) o;
        return id != null && Objects.equals(id, compte.id);
    }
}
