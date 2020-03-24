package edu.escuelaing.arsw.auctions.services;

import java.util.List;
import edu.escuelaing.arsw.auctions.model.Oferta;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface OfertaServices {
	
    public List<Oferta> getAllOfertas();

    public List <Oferta> getOferta(int id) throws AuctionNotFoundException;
    
    void saveOferta(Oferta oferta) throws AuctionPersistanceException;
    
    public int addOferta(Oferta oferta);
    
    public void updateOferta(Oferta of,int id);

	public List<Oferta> getOfertaByUsuario(String IdUsuario);

	public List<Oferta> getOfertaByPublicacion(int IdPublicacion);

	public String getUsuarioById(int id);  
    
}

