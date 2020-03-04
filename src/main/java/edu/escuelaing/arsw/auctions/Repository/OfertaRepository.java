package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Oferta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, String>{
        @Override
	List<Oferta> findAll();

}