package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Preferencia;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.PreferenciaServices;

@Service("PreferenciaServices")
public class PreferenciaServicesImpl implements PreferenciaServices {

	@Override
	public List<Preferencia> getAllPublicaciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Preferencia getPreferencia(int idUsuario) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePreferencia(Preferencia preferencia) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

}
