package edu.escuelaing.arsw.auctions.Repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.PublicacionRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Publicacion;

public class PublicacionRepositoryImpl implements PublicacionRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Publicacion> findListById(int id) {
		//arreglar
		Query query = entityManager.createNativeQuery("select * from publicacion where =?",Publicacion.class);
		 
		 query.setParameter(1, id )
             .setParameter(2, id ).executeUpdate();
		 return null;
	}

	@Override
	public void addPublicacion(Publicacion publicacion) {
		//arreglar
		Query query = entityManager.createNativeQuery("insert into publicacion values(--------------)",Publicacion.class);
		 
		 query.setParameter(1, publicacion )
            .setParameter(2, publicacion ).executeUpdate();
	}

}
