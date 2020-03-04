package edu.escuelaing.arsw.auctions.services;
import java.util.List;

import edu.escuelaing.arsw.auctions.model.Preferencia;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface PreferenciaServices {
	
	public List<Preferencia> getAllPublicaciones();

    public Preferencia getPreferencia(int idUsuario) throws AuctionNotFoundException;

    void savePreferencia(Preferencia preferencia) throws AuctionPersistanceException;
	

}
