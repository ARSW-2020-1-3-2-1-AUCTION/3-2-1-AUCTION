package edu.escuelaing.arsw.auctions.cache.Impl;



import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;
import edu.escuelaing.arsw.auctions.cache.AuctionCache;

@Service("AuctionCacheImpl")
public class AuctionCacheImpl implements AuctionCache {
	
	private CopyOnWriteArrayList<String> loginUsers = new  CopyOnWriteArrayList<String>();
	private CopyOnWriteArrayList<Integer> pujasEncurso = new  CopyOnWriteArrayList<Integer>();

	@Override
	public void postUsername(String usuario) {
		loginUsers.add(usuario);
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
	public void setPujaEnCurso(int id) {
		if (!pujasEncurso.contains(id)) {
			pujasEncurso.add(id);
		}
		
	}

	@Override
	public List<Integer> getPujasEnCurso() {
		return pujasEncurso;
		
	}

	@Override
	public void deletePujaEnCurso(int id) {
		for (int i=0 ; i<pujasEncurso.size() ; i++) {
			if (pujasEncurso.get(i) == id) {
				pujasEncurso.remove(i);
			}
		}
	}

}
