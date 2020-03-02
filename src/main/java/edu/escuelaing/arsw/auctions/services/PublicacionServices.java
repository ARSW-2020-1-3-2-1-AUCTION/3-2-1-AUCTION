package edu.escuelaing.arsw.auctions.services;

import java.util.List;

import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface PublicacionServices {
	
    
    public List<Publicacion> getAllPublicaciones();

    public Publicacion getPublicacion(int id) throws AuctionNotFoundException;
    
    void savePublicacion(Publicacion publicacion) throws AuctionPersistanceException;
    
    public void changeState(Publicacion at, int id);
}
