package edu.escuelaing.arsw.auctions.services;
import java.util.List;

import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.*;


public interface UsuarioServices {
	
	    public Usuario addUser(Usuario user) throws AuctionPersistanceException;
	    
	    public List<Usuario> getAllUsers();
	   
	    public Usuario getUsuario(String username) throws AuctionNotFoundException;
	}


