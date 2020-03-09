package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Usuario> getAllUsers() {
		System.out.println(userRepo.findAll());
		return userRepo.findAll();
	}
	
	@Override
	public Usuario getUsuario(int id) throws AuctionNotFoundException {
		System.out.println(id + "--------");
		Usuario usuario = userRepo.findById(id).get();
		if (usuario==null) System.out.println(id + "<--------");
		return usuario;
	}	

	@Override
	public void addUser(Usuario user) throws AuctionPersistanceException {
		
	}

	@Override
	public void setSaldo(int id, int saldo) throws AuctionPersistanceException {
		userRepo.setSaldo(id,saldo);
	}	

	@Override
	public int getSaldo(int id) throws AuctionNotFoundException {
		return userRepo.getSaldo(id);
	}

}
