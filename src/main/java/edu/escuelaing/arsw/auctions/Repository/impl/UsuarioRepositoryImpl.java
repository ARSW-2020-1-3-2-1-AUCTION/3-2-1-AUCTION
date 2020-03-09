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
	public void setSaldo(int id, int saldo) {
		 Query query = entityManager.createNativeQuery("update usuario set saldo=? where id=?",Usuario.class);
		 
		 query.setParameter(1, saldo )
              .setParameter(2, id ).executeUpdate();

	}

	@Override
	public int getSaldo(int id) {
		Query query = entityManager.createQuery("select Saldo from usuario where id=:ID");
		query.setParameter("ID", id);
		
		return query.getFirstResult();
		
	}
	
}
