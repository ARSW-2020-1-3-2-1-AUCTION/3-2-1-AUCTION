package edu.escuelaing.arsw.auctions.services.impl;

import edu.escuelaing.arsw.auctions.Repository.ImagenRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Imagen;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.ImagenServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service("ImagenServices")
public class ImagenServicesImpl implements ImagenServices {

        @Autowired
	private ImagenRepository imagenRepo;
        
    
	@Override
	public List<Imagen> getAllImagenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Imagen getImagen(int id) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveImagen(Imagen imagen) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addImagen(Imagen imagen) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOferta(Imagen im, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteImagen(int id) {
		// TODO Auto-generated method stub

	}

}
