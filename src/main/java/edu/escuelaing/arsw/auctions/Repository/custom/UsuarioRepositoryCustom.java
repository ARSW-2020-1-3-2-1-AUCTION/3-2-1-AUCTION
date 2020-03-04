package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Usuario;

public interface UsuarioRepositoryCustom {
	
	@Transactional
	public List<Usuario> findById(String userName);

}
