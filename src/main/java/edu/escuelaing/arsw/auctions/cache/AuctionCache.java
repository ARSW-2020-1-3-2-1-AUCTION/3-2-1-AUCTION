package edu.escuelaing.arsw.auctions.cache;

import java.util.List;

public interface AuctionCache {
	
	public void postUsername(String usuario);
	
	public boolean existUsername(String usuario);
	
	public void deleteUsername(String usuario);

	public void setPujaEnCurso(int id);
	
	public void deletePujaEnCurso(int id);

	public List<Integer> getPujasEnCurso();

	public boolean ofertaPermitida(int userName, int ultimaOferta, int cantidadAPujar);

}
