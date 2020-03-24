package edu.escuelaing.arsw.auctions.services.impl;
import edu.escuelaing.arsw.auctions.Repository.OfertaRepository;

import java.util.List;
import org.springframework.stereotype.Service;
import edu.escuelaing.arsw.auctions.model.Oferta;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.OfertaServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service("OfertaServices")
public class OfertaServicesImpl implements OfertaServices {
    
    @Autowired
	private OfertaRepository ofertaRepo;
    
	@Override
	public List<Oferta> getAllOfertas() {
		  return ofertaRepo.findAll();
	}

	@Override
	public List<Oferta> getOferta(int id) throws AuctionNotFoundException {
		return ofertaRepo.getOferta(id);
		
	}

	@Override
	public void saveOferta(Oferta oferta) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public int addOferta(Oferta oferta) {
		return ofertaRepo.addOferta(oferta).get(0).getId();
		
	}

	@Override
	public void updateOferta(Oferta of, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Oferta> getOfertaByUsuario(String IdUsuario) {
		return ofertaRepo.getOfertaByUsuario(IdUsuario);
	}

	@Override
	public List<Oferta> getOfertaByPublicacion(int IdPublicacion) {
		return ofertaRepo.getOfertaByPublicacion(IdPublicacion);
	}

	@Override
	public String getUsuarioById(int id) {
		return ofertaRepo.getUsuarioById(id).get(0).getUsuario();
	}

}
