package edu.escuelaing.arsw.auctions.services;
import java.util.List;

import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.*;


public interface UsuarioServices {
	
	public List<Usuario> getAllUsers();
	
	public Usuario getUsuario(String id) throws AuctionNotFoundException;
	
	public Usuario addUser(Usuario user) throws AuctionPersistanceException;
	    
	public int setSaldo(String id, int saldo) throws AuctionPersistanceException;
	
	public void setPuntuacion(int id,int puntos);
	
	public void postUsernameCache(Usuario usuario);

	public boolean existUsername(String usuario);
	
	public void deleteUsernameCache(String usuario);

	public int getSaldo(String id);
	
	public boolean ofertaPermitida(int userName,int ultimaOferta,int cantidadAPujar);
	    
}