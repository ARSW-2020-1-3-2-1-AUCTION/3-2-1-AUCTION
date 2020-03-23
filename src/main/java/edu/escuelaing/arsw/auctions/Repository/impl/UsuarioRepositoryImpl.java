package edu.escuelaing.arsw.auctions.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.UsuarioRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public List<Usuario> getSaldo(String id) {
		Query query = entityManager.createNativeQuery("select * from usuario where id=?",Usuario.class);
		
		query.setParameter(1, id);
		return query.getResultList();
		
	}

	@Override
	public void setSaldo(String id, int saldo) {
		 Query query = entityManager.createNativeQuery("update usuario set saldo=?+(select saldo where id=?) where id=?",Usuario.class);
		 
		 query.setParameter(1, saldo )
              .setParameter(2, id )
              .setParameter(3, id ).executeUpdate();

	}

	@Override
	public void setPuntuacion(int id, int puntos) {
		Query query = entityManager.createNativeQuery("update usuario set puntuacion=? where id=?",Usuario.class);
		 
		query.setParameter(1, puntos )
             .setParameter(2, id ).executeUpdate();
		
	}
	
}
