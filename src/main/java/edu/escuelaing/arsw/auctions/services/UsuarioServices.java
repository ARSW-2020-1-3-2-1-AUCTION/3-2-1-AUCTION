package edu.escuelaing.arsw.auctions.services;
import java.util.List;

import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.*;


public interface UsuarioServices {
	
	public List<Usuario> getAllUsers();
	
	public Usuario getUsuario(int id) throws AuctionNotFoundException;
	
	//Se puede elimar???
	public void addUser(Usuario user) throws AuctionPersistanceException;
	    
	public void setSaldo(int id, int saldo) throws AuctionPersistanceException;
	
	public void setPuntuacion(int id,int puntos);
	    
}


