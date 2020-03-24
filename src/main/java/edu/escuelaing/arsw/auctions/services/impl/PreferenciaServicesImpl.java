package edu.escuelaing.arsw.auctions.services.impl;

import edu.escuelaing.arsw.auctions.Repository.PreferenciaRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Preferencia;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.PreferenciaServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service("PreferenciaServicesImpl")
public class PreferenciaServicesImpl implements PreferenciaServices {
        
    @Autowired
	private PreferenciaRepository preferenciaRepo;

	@Override
	public List<Preferencia> getPreferencias(String idUsuario) throws AuctionNotFoundException {
		return preferenciaRepo.getPreferencias(idUsuario);
	}

	@Override
	public void savePreferencia(String usuario,int publicacion) throws AuctionPersistanceException {
		preferenciaRepo.savePreferencia(usuario,publicacion);

	}

}
