package edu.escuelaing.arsw.auctions.services;
import java.util.List;

import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.*;


public interface UsuarioServices {
	
	    public Usuario addUser(Usuario user) throws AuctionPersistanceException;
	    
	    public Usuario addSaldo(Usuario Saldo) throws AuctionPersistanceException;
	    
	    void saveUser(Usuario usuario) throws AuctionPersistanceException;
	    
	    Usuario findUserByEmail(String correoElectronico) throws AuctionPersistanceException;
	    
	    public List<Usuario> getAllUsers();
	   
	    public Usuario getUsuario(int id) throws AuctionNotFoundException;
	    
	    public Usuario getSaldo(String userName) throws AuctionNotFoundException;
	    
	    void updateSaldo(int saldo, Usuario usuario) throws AuctionPersistanceException;
	}


