package edu.escuelaing.arsw.auctions.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.PreferenciaRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Preferencia;
import edu.escuelaing.arsw.auctions.model.Publicacion;

public class PreferenciaRepositoryImpl implements PreferenciaRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Preferencia> getPreferencias(String idUsuario) {
		System.out.println(idUsuario);
		Query query = entityManager.createNativeQuery("select * from preferencia where usuario=?",Publicacion.class);
		 
		query.setParameter(1, idUsuario );
		return query.getResultList();
	}

}
