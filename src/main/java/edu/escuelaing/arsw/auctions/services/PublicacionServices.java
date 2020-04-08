package edu.escuelaing.arsw.auctions.services;

import java.util.List;

import edu.escuelaing.arsw.auctions.model.Publicacion;	
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface PublicacionServices {
	
    public List<Publicacion> getAllPublicaciones();

    public Publicacion getPublicacion(int id) throws AuctionNotFoundException;
    
    public void addPublicacion(Publicacion publicacion) throws AuctionPersistanceException;

    public List<Publicacion> getPublicacionByUsuario(String IdUsuario);
	
    public List<Publicacion> getPublicacionByCategoria(int IdCategoria);

	public void deletePublicacion(int id);

	public void changeState(Publicacion pb, int id);

	public void setOferta(int valor, int ofertaid, int publicacionId);

	public void setPujaEnCurso(int id);
	
	public void deletePujaEnCurso(int id);

	public List<Publicacion> getPujasEnCurso();
}

