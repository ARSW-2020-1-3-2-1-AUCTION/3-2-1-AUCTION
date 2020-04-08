package edu.escuelaing.arsw.auctions.services.impl;

import edu.escuelaing.arsw.auctions.Repository.PublicacionRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.PublicacionServices;
import edu.escuelaing.arsw.auctions.cache.AuctionCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("PublicacionServices")
public class PublicacionServicesImpl implements PublicacionServices {
        
    @Autowired
	private PublicacionRepository publicacionRepo;
    
    @Autowired
    @Qualifier("AuctionCacheImpl")
    private AuctionCache AuctionCache;
    
	@Override
	public List<Publicacion> getAllPublicaciones() {
		return publicacionRepo.findAll();
	}

	@Override
	public Publicacion getPublicacion(int id) throws AuctionNotFoundException {
		return publicacionRepo.findById(id).get();
	}

	@Override
	public void addPublicacion(Publicacion publicacion) throws AuctionPersistanceException {
		publicacionRepo.addPublicacion(publicacion);
	}

	@Override
	public List<Publicacion> getPublicacionByUsuario(String IdUsuario) {
		return publicacionRepo.getPublicacionByUsuario(IdUsuario);
	}

	@Override
	public List<Publicacion> getPublicacionByCategoria(int IdCategoria) {
		return publicacionRepo.getPublicacionByCategoria(IdCategoria);
	}

	@Override
	public void deletePublicacion(int id) {
		publicacionRepo.deleteById(id);
	}

	@Override
	public void changeState(Publicacion pb, int id) {
		publicacionRepo.changeState(pb,id);
		
	}

	@Override
	public void setOferta(int valor, int ofertaid,int publicacionId) {
		publicacionRepo.setOferta(valor,ofertaid,publicacionId);
		
	}

	@Override
	public void setPujaEnCurso(int id) {
		AuctionCache.setPujaEnCurso(id);
		
	}

	@Override
	public List<Publicacion> getPujasEnCurso() {
		List<Integer> publicaciones = AuctionCache.getPujasEnCurso();
		List<Publicacion> pujasEnCurso = new ArrayList<>();
		for (int i : publicaciones) {
			pujasEnCurso.add(publicacionRepo.findById(i).get());
		}
		return pujasEnCurso;
	}

	@Override
	public void deletePujaEnCurso(int id) {
		AuctionCache.deletePujaEnCurso(id);
		
	}

}
