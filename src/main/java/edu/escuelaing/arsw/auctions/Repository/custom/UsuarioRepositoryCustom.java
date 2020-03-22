package edu.escuelaing.arsw.auctions.Repository.custom;

import javax.transaction.Transactional;

public interface UsuarioRepositoryCustom {
	
	@Transactional
    public int getSaldo(String id);
	
	@Transactional
    public void setSaldo(int id, int saldo);
	
	@Transactional
	public void setPuntuacion(int id,int puntos);

}
