package edu.escuelaing.arsw.auctions.Repository.custom;

import java.util.List;

import javax.transaction.Transactional;

import edu.escuelaing.arsw.auctions.model.Usuario;

public interface UsuarioRepositoryCustom {
	
	@Transactional
    public List<Usuario> getSaldo(String id);
	
	@Transactional
    public void setSaldo(String id, int saldo);
	
	@Transactional
	public void setPuntuacion(int id,int puntos);

}
