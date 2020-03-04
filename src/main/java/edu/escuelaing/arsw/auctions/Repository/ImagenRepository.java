package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Imagen;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, String>{
	List<Imagen> findAll();

}