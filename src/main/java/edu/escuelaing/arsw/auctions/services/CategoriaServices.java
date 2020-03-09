package edu.escuelaing.arsw.auctions.services;
import java.util.List;


import edu.escuelaing.arsw.auctions.model.Categoria;
import edu.escuelaing.arsw.auctions.model.Publicacion;

import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface CategoriaServices {
	
    public List<Categoria> getAllCategorias();

    public Categoria getCategoria(int id) throws AuctionNotFoundException;
    
    public Categoria addPublicacion(Publicacion publicacion) throws AuctionPersistanceException;

    public void addCategoria(Categoria categoria);
	
    public Categoria addArticulo(Publicacion id) throws AuctionPersistanceException;

    public void saveDriver(Publicacion publicacion);

}
