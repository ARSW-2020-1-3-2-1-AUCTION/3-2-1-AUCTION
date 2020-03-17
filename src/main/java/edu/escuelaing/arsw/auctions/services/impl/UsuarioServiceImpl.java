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
		return userRepo.findAll();
	}
	
	@Override
	public Usuario getUsuario(String id) throws AuctionNotFoundException {
		Usuario usuario = userRepo.findById(id).get();
		return usuario;
	}	

	@Override
	public Usuario addUser(Usuario user) throws AuctionPersistanceException {
		try {
            Usuario u = getUsuario(user.getId());
            throw new AuctionPersistanceException("Nombre de usuario ya tomado");
        }
        catch(AuctionNotFoundException ce){

            return userRepo.saveAndFlush(user);
        }
	}

	@Override
	public void setSaldo(int id, int saldo) throws AuctionPersistanceException {
		userRepo.setSaldo(id,saldo);
	}

	@Override
	public void setPuntuacion(int id, int puntos) {
		userRepo.setPuntuacion(id,puntos);
	}	

}
