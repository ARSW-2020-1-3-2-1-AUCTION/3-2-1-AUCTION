package edu.escuelaing.arsw.auctions.cache.Impl;

import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.stereotype.Service;
import edu.escuelaing.arsw.auctions.cache.AuctionCache;

@Service("AuctionCacheImpl")
public class AuctionCacheImpl implements AuctionCache {
	
	private CopyOnWriteArrayList<String> loginUsers = new  CopyOnWriteArrayList<String>();

	@Override
	public void postUsernameCache(String usuario) {
		loginUsers.add(usuario);
		
	}

	@Override
	public boolean existUsername(String usuario) {
		return loginUsers.contains(usuario);
	}

}
