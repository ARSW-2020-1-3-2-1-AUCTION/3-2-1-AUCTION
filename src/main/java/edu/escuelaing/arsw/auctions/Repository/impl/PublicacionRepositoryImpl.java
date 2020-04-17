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
		Query query = entityManager.createNativeQuery("insert into publicacion values(NEXTVAL('serial'),?,?,?,?,?,?,?,?,?,?,?,?,?,?)",Publicacion.class);
		 
		 query.setParameter(1, publicacion.getDescripcion())
		 	  .setParameter(2, publicacion.getValor() )
		 	  .setParameter(3, new Date())
		 	  .setParameter(4, publicacion.getFechadeSubasta())
		 	  .setParameter(5, publicacion.getUsado() )
		 	  .setParameter(6, "Activo" )
		 	  .setParameter(7, 1)
		 	  .setParameter(8, publicacion.getCategoria() )
		 	  .setParameter(9, publicacion.getUsuario() )
		 	  .setParameter(10, publicacion.getNombre() )
		 	  .setParameter(11, publicacion.getUbicacion() )
              .setParameter(12, publicacion.getMarca() )
              .setParameter(13, publicacion.getImagen() )
		 	  .setParameter(14, publicacion.getTiempo()).executeUpdate();
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

	@Override
	public void changeState(Publicacion pb, int id) {
		Query query = entityManager.createNativeQuery("update publicacion set descripcion=?,valor=?,fecha_publicacion=?,fecha_de_subasta=?,usado=?,estado=?,oferta=?,categoria=?,usuario=?,nombre=?,ubicacion=?,marca=?,imagen=?,tiempo=? where id=? ",Publicacion.class);
        
        query.setParameter(1, pb.getDescripcion() )
                .setParameter(2, pb.getValor() )
                .setParameter(3, pb.getFechaPublicacion() )
                .setParameter(4, pb.getFechadeSubasta() )
                .setParameter(5, pb.getUsado() )
                .setParameter(6, pb.getEstado() )
                .setParameter(7, pb.getOferta() )
                .setParameter(7, pb.getCategoria() )
                .setParameter(9, pb.getUsuario() )
                .setParameter(10, pb.getNombre() )
                .setParameter(11, pb.getUbicacion() )
                .setParameter(12, pb.getMarca() )
                .setParameter(13, pb.getImagen() )
                .setParameter(14, pb.getTiempo() )
                .setParameter(15, id ).executeUpdate();
		
	}

	@Override
	public void setOferta(int valor, int ofertaid, int publicacionId) {
			Query query = entityManager.createNativeQuery("update publicacion set valor=?,oferta=? where id=?",Publicacion.class);
        
        query.setParameter(1,valor )
             .setParameter(2, ofertaid )
             .setParameter(3, publicacionId).executeUpdate();
		
	}

}
