package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String>{
	List<Categoria> findAll();

}