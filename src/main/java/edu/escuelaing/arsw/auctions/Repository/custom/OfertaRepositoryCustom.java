package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Oferta;

public interface OfertaRepositoryCustom {
	
	@Transactional
	public List<Oferta> addOferta(Oferta oferta);
	
	@Transactional
	public List<Oferta> getOfertaByUsuario(String IdUsuario);
	
	@Transactional
    public List<Oferta> getOfertaByPublicacion(int IdPublicacion);

	@Transactional
	public List<Oferta> getUsuarioById(int id);
	
	@Transactional
    public void setOferta(int id, int oferta);
	
	@Transactional
    public List<Oferta> getOferta(int id);

}
