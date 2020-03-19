package edu.escuelaing.arsw.auctions.Repository;

import org.springframework.stereotype.Repository;


import edu.escuelaing.arsw.auctions.Repository.custom.UsuarioRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>, UsuarioRepositoryCustom{

}