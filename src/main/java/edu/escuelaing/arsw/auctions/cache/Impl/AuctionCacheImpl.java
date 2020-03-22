package edu.escuelaing.arsw.auctions.cache.Impl;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;
import edu.escuelaing.arsw.auctions.cache.AuctionCache;

@Service("AuctionCacheImpl")
public class AuctionCacheImpl implements AuctionCache {
	
	private ConcurrentHashMap<String,Integer> loginUsers = new  ConcurrentHashMap<String,Integer>();

	@Override
	public void postUsername(String usuario, int saldo) {
		loginUsers.put(usuario,saldo);
		
	}

	@Override
	public boolean existUsername(String usuario) {
		return loginUsers.contains(usuario);
	}

	@Override
	public void deleteUsername(String usuario) {
		loginUsers.remove(usuario);
		
	}

	@Override
	public int getSaldo(String id) {
		return loginUsers.get(id);
	}

}
