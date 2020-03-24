package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;

import edu.escuelaing.arsw.auctions.Repository.custom.PreferenciaRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Preferencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PreferenciaRepository extends JpaRepository<Preferencia, Integer>,PreferenciaRepositoryCustom{
        
}