package edu.escuelaing.arsw.auctions.services;

import java.util.List;

import edu.escuelaing.arsw.auctions.model.Oferta;

import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface OfertaServices {
	
    
    public List<Oferta> getAllPublicaciones();

    public Oferta getOferta(int id) throws AuctionNotFoundException;
    
    void saveOferta(Oferta oferta) throws AuctionPersistanceException;
    
    Oferta findOfertByUser(String userName) throws AuctionPersistanceException;
    
    public void addOferta(Oferta oferta);
    
    
}

