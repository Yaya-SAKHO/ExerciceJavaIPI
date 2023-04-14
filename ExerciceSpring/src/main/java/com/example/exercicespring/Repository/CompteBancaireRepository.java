package com.example.exercicespring.Repository;

import com.example.exercicespring.entites.Banque;
import com.example.exercicespring.entites.CompteBancaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteBancaireRepository extends CrudRepository<CompteBancaire, Long> {

}