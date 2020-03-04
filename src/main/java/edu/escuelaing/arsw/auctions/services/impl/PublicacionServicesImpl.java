package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.PublicacionServices;

@Service("PublicacionServices")
public class PublicacionServicesImpl implements PublicacionServices {

	@Override
	public List<Publicacion> getAllPublicaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publicacion getPublicacion(int id) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario addPublicacion(Publicacion publicacion) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePublicacion(Publicacion publicacion) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Publicacion getPublicacionByUsuario(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publicacion getPublicacionByCategoria(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePublicacion(int publicacion) {
		// TODO Auto-generated method stub

	}

}
