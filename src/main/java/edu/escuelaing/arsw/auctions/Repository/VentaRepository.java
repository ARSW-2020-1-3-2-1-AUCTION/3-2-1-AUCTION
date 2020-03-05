package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Venta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, String>{
     

}