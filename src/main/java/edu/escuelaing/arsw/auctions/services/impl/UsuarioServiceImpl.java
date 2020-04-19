package edu.escuelaing.arsw.auctions.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.Repository.UsuarioRepository;
import edu.escuelaing.arsw.auctions.cache.AuctionCache;
import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.UsuarioServices;

@Service("UsuarioServices")
public class UsuarioServiceImpl implements UsuarioServices {
	
	@Autowired
	private UsuarioRepository userRepo;
	
	 @Autowired
	 @Qualifier("AuctionCacheImpl")
	 AuctionCache auctionCache;
	
	  @Override
	    public List<Usuario> getAllUsers(){
	        return userRepo.findAll(); 
	    }
	
	  @Override
	    public Usuario getUsuario(String id) throws AuctionNotFoundException{
	        try{
	            Usuario user = userRepo.findById(id).get();
	            return user;
	        }
	        catch(java.util.NoSuchElementException e){
	           throw new AuctionNotFoundException("No existe el usuario");
	        }
	           
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
	public int setSaldo(String id, int saldo) throws AuctionPersistanceException {
		userRepo.setSaldo(id,saldo);
		return userRepo.getSaldo(id).get(0).getSaldo();
	}

	@Override
	public void setPuntuacion(int id, int puntos) {
		userRepo.setPuntuacion(id,puntos);
	}

	@Override
	public void postUsernameCache(Usuario usuario) {
		auctionCache.postUsername(usuario.getId());
	}
	
	@Override
	public boolean existUsername(String usuario) {
		return auctionCache.existUsername(usuario);
	}

	@Override
	public void deleteUsernameCache(String usuario) {
		auctionCache.deleteUsername(usuario);
		
	}

	@Override
	public int getSaldo(String id) {
		return userRepo.getSaldo(id).get(0).getSaldo();
	}

	@Override
	public boolean ofertaPermitida(int userName, int ultimaOferta, int cantidadAPujar) {
		return auctionCache.ofertaPermitida(userName,ultimaOferta,cantidadAPujar);
	}

}
