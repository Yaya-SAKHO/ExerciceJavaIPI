package com.example.exercicespring.Repository;

import com.example.exercicespring.entites.Banque;
import com.example.exercicespring.entites.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Long> {

}