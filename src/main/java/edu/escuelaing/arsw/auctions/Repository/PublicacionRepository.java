package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.model.Publicacion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, String>{
        

}