package edu.escuelaing.arsw.auctions.cache;

public interface AuctionCache {
	
	public void postUsername(String usuario);
	
	public boolean existUsername(String usuario);
	
	public void deleteUsername(String usuario);

}
