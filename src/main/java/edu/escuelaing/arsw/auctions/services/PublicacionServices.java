package edu.escuelaing.arsw.auctions.services;

import java.util.List;

import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface PublicacionServices {
	
    
    public List<Publicacion> getAllPublicaciones();

    public Publicacion getPublicacion(int id) throws AuctionNotFoundException;
    
    public Usuario addPublicacion(Publicacion publicacion) throws AuctionPersistanceException;
    
    void savePublicacion(Publicacion publicacion) throws AuctionPersistanceException;
    

	Publicacion getPublicacionByUsuario(String userName);
	
	Publicacion getPublicacionByCategoria(int id);

	public void deletePublicacion(int publicacion);
}

