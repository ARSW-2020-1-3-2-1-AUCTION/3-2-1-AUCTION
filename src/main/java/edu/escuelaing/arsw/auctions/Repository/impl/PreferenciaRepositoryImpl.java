package edu.escuelaing.arsw.auctions.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.PreferenciaRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Preferencia;

public class PreferenciaRepositoryImpl implements PreferenciaRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Preferencia> getPreferencias(String idUsuario) {
		Query query = entityManager.createNativeQuery("select * from preferencia where usuario=?",Preferencia.class);
		 
		query.setParameter(1, idUsuario );
		return query.getResultList();
	}

	@Override
	public void savePreferencia(String usuario, int publicacion) {
		Query query = entityManager.createNativeQuery("insert into preferencia values(?,?,NEXTVAL('serialPref'))",Preferencia.class);
		 
		 query.setParameter(1, usuario )
		      .setParameter(2, publicacion ).executeUpdate();
		
	}

}
