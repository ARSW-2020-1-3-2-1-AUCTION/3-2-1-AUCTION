package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.Repository.UsuarioRepository;
import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.UsuarioServices;

@Service("UsuarioServices")
public class UsuarioServiceImpl implements UsuarioServices {
	
	@Autowired
	private UsuarioRepository userRepo;

	@Override
	public Usuario addUser(Usuario user) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario addSaldo(Usuario Saldo) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(Usuario usuario) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findUserByEmail(String correoElectronico) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuario(String userName) throws AuctionNotFoundException {
		Usuario usuario = userRepo.findById(userName).get(0);
		return usuario;
	}

	@Override
	public Usuario getSaldo(String userName) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSaldo(int saldo, Usuario usuario) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		
	}

}
