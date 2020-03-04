package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Oferta;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.OfertaServices;

@Service("OfertaServices")
public class OfertaServicesImpl implements OfertaServices {

	@Override
	public List<Oferta> getAllPublicaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta getOferta(int id) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOferta(Oferta oferta) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Oferta findOfertByUser(String userName) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOferta(Oferta oferta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOferta(Oferta of, int id) {
		// TODO Auto-generated method stub

	}

}
