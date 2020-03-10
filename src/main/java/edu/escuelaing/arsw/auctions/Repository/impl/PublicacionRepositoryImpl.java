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
	public void addPublicacion(Publicacion publicacion) {
		Query query = entityManager.createNativeQuery("insert into publicacion values(?,?,?,?,?,?,?,?,?,?,?,?,?)",Publicacion.class);
		 
		 query.setParameter(1, publicacion.getID() )
		 	  .setParameter(2, publicacion.getDescripcion())
		 	  .setParameter(3, publicacion.getValor() )
		 	  .setParameter(4, publicacion.getFechaPublicacion() )
		 	  .setParameter(5, publicacion.getFechadeSubasta() )
		 	  .setParameter(6, publicacion.getUsado() )
		 	  .setParameter(7, publicacion.getEstado() )
		 	  .setParameter(8, publicacion.getOferta())
		 	  .setParameter(9, publicacion.getCategoria() )
		 	  .setParameter(10, publicacion.getUsuario() )
		 	  .setParameter(11, publicacion.getNombre() )
		 	  .setParameter(12, publicacion.getUbicacion() )
              .setParameter(13, publicacion.getMarca() ).executeUpdate();
	}

	@Override
	public List<Publicacion> getPublicacionByUsuario(String IdUsuario) {
		Query query = entityManager.createNativeQuery("select * from publicacion where usuario=?",Publicacion.class);
		 
		query.setParameter(1, IdUsuario ).executeUpdate();
		return query.getResultList();
	}

	@Override
	public List<Publicacion> getPublicacionByCategoria(int IdCategoria) {
		Query query = entityManager.createNativeQuery("select * from publicacion where categoria=?",Publicacion.class);
		 
		query.setParameter(1, IdCategoria ).executeUpdate();
		return query.getResultList();
	}

}
