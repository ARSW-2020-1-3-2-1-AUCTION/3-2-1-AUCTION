package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Publicacion;

public interface PublicacionRepositoryCustom {
	
	@Transactional
	public void addPublicacion(Publicacion publicacion);
	
	@Transactional
    public List<Publicacion> findListById(int id);

}
