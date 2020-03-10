package edu.escuelaing.arsw.auctions.Repository.custom;


import javax.transaction.Transactional;

public interface UsuarioRepositoryCustom {
	
	@Transactional
    public void setSaldo(int id, int saldo);
	
	@Transactional
	public void setPuntuacion(int id,int puntos);

}
