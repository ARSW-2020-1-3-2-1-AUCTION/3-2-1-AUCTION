package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Preferencia;

public interface PreferenciaRepositoryCustom {
	
	@Transactional
	public List<Preferencia> getPreferencias(String idUsuario);
	
	@Transactional
	public void savePreferencia(String usuario,int publicacion);

}
