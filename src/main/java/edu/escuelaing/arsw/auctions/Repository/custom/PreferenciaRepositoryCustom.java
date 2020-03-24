package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import edu.escuelaing.arsw.auctions.model.Preferencia;

public interface PreferenciaRepositoryCustom {
	
	public List<Preferencia> getPreferencias(String idUsuario);
	
	public void savePreferencia(String usuario,int publicacion);

}
