package edu.escuelaing.arsw.auctions.services;
import java.util.List;


import edu.escuelaing.arsw.auctions.model.Imagen;

import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface ImagenServices {
	
	public List<Imagen> getAllImagenes();

    public Imagen getImagen(int id) throws AuctionNotFoundException;

    void saveImagen(Imagen imagen) throws AuctionPersistanceException;
	

}
