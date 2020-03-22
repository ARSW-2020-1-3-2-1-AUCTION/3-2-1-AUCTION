package edu.escuelaing.arsw.auctions.Repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.UsuarioRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public int getSaldo(String id) {
		Query query = entityManager.createNativeQuery("select saldo from usuario where id=?",Usuario.class);
		
		query.setParameter(1, id);
		return (int) query.getSingleResult();
		
	}

	@Override
	public void setSaldo(int id, int saldo) {
		 Query query = entityManager.createNativeQuery("update usuario set saldo=? where id=?",Usuario.class);
		 
		 query.setParameter(1, saldo )
              .setParameter(2, id ).executeUpdate();

	}

	@Override
	public void setPuntuacion(int id, int puntos) {
		Query query = entityManager.createNativeQuery("update usuario set puntuacion=? where id=?",Usuario.class);
		 
		query.setParameter(1, puntos )
             .setParameter(2, id ).executeUpdate();
		
	}
	
}
