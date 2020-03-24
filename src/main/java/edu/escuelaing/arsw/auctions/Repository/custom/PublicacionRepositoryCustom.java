package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Publicacion;

public interface PublicacionRepositoryCustom {
	
	@Transactional
	public void addPublicacion(Publicacion publicacion);
	
	@Transactional
	public List<Publicacion> getPublicacionByUsuario(String IdUsuario);
	
	@Transactional
    public List<Publicacion> getPublicacionByCategoria(int IdCategoria);

	 @Transactional
	    public void changeState(Publicacion pb,int id);
	 
	 @Transactional
	 public void setOferta(int valor, int ofertaid, int publicacionId);
}
