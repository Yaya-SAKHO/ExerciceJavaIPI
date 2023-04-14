package com.example.exercicespring.Repository;

import com.example.exercicespring.entites.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    @Query("FROM Client   WHERE nom = :nom and prenom = :prenom")
    List<Client> findByFirstNameAndLastName(@Param("nom") String nom, @Param("prenom") String prenom);



}