package edu.escuelaing.arsw.auctions.services;
import java.util.List;


import edu.escuelaing.arsw.auctions.model.Categoria;

import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;

public interface CategoriaServices {
	
	public List<Categoria> getAllCategorias();

    public Categoria getCategoria(int id) throws AuctionNotFoundException;

}
