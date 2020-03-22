package edu.escuelaing.arsw.auctions.Repository.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Converter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.escuelaing.arsw.auctions.Repository.custom.PublicacionRepositoryCustom;
import edu.escuelaing.arsw.auctions.model.Publicacion;

@Converter(autoApply = true)
public class PublicacionRepositoryImpl implements PublicacionRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public void addPublicacion(Publicacion publicacion) {
		System.out.println(publicacion.getValor());
		System.out.println(publicacion.getFechadeSubasta());
		System.out.println(publicacion.getCategoria());
		Query query = entityManager.createNativeQuery("insert into publicacion values(NEXTVAL('serial'),?,?,?,?,?,?,?,?,?,?,?,?)",Publicacion.class);
		 
		 query.setParameter(1, publicacion.getDescripcion())
		 	  .setParameter(2, publicacion.getValor() )
		 	  .setParameter(3, new Date())
		 	  .setParameter(4, new Date() )
		 	  .setParameter(5, publicacion.getUsado() )
		 	  .setParameter(6, "Activo" )
		 	  .setParameter(7, 1)
		 	  .setParameter(8, publicacion.getCategoria() )
		 	  .setParameter(9, publicacion.getUsuario() )
		 	  .setParameter(10, publicacion.getNombre() )
		 	  .setParameter(11, publicacion.getUbicacion() )
              .setParameter(12, publicacion.getMarca() ).executeUpdate();
	}

	@Override
	public List<Publicacion> getPublicacionByUsuario(String IdUsuario) {
		Query query = entityManager.createNativeQuery("select * from publicacion where usuario=?",Publicacion.class);
		 
		query.setParameter(1, IdUsuario );
		return query.getResultList();
	}

	@Override
	public List<Publicacion> getPublicacionByCategoria(int IdCategoria) {
		Query query = entityManager.createNativeQuery("select * from publicacion where categoria=?",Publicacion.class);
		 
		query.setParameter(1, IdCategoria);
		return query.getResultList();
	}

}
