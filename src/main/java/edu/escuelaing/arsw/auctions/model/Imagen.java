package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import java.io.Serializable;

@Entity(name="imagen")
@Table(name="imagen")
public class Imagen implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="id")
	int Id;
	
	@Column(name="publicacion")
    int Publicacion; 

	public int getId() {
 		return Id;
 	}

 	public void setId(int ID) {
 		this.Id = ID;
 	}
 	
 	 public int getPublicacion() {
 		return Publicacion;
 	}

 	public void setPublicación(int publicacion) {
 		Publicacion = publicacion;
 	}

}
