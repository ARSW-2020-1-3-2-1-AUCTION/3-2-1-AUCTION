package edu.escuelaing.arsw.auctions.Repository.impl;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.escuelaing.arsw.auctions.Repository.custom.UsuarioRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Usuario;

public class UsuarioRepositoryImpl implements UsuarioRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Usuario> findById(String userName) {
		 Query query =  entityManager.createNativeQuery("select * from usuario u where u.id=?",Usuario.class);	        
	     query.setParameter(1, userName);
	     return query.getResultList();
	}

}
