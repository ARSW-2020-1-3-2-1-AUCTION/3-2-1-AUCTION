package edu.escuelaing.arsw.auctions.cache;

public interface AuctionCache {
	
	public void postUsernameCache(String usuario);
	
	public boolean existUsername(String usuario);

}
