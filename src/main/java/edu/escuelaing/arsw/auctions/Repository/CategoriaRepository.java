package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Categoria;
import java.util.List;
import java.util.stream.Stream;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{


}