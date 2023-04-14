package com.example.exercicespring.entites;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "banques")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Banque {

    @Id
    @Column(name = "id_banque")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "banque", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> listeClients = new ArrayList<>();

    public void addClient(Client client) {
        listeClients.add(client);
        client.setBanque(this);
    }

    public void removeClient(Client client) {
        listeClients.remove(client);
        client.setBanque(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Banque banque = (Banque) o;
        return id != null && Objects.equals(id, banque.id);
    }
}
