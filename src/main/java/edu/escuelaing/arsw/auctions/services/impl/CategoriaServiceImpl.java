package edu.escuelaing.arsw.auctions.services.impl;

import edu.escuelaing.arsw.auctions.Repository.CategoriaRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Categoria;
import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service("CategoriaServices")
public class CategoriaServiceImpl implements CategoriaServices {

        @Autowired
	private CategoriaRepository categoriaRepo;
    
	@Override
	public List<Categoria> getAllCategorias() {
		return categoriaRepo.findAll();
	}

	@Override
	public Categoria getCategoria(int id) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria addPublicacion(Publicacion publicacion) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCategoria(Categoria categoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public Categoria addArticulo(Publicacion id) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDriver(Publicacion publicacion) {
		// TODO Auto-generated method stub

	}

}
