package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity(name="imagen")
@Table(name="imagen")
public class Imagen implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="id")
	int Id;
	
	@Column(name="publicación")
    int Publicación; 

	public int getId() {
 		return Id;
 	}

 	public void setId(int ID) {
 		this.Id = ID;
 	}
 	
 	 public int getPublicación() {
 		return Publicación;
 	}

 	public void setPublicación(int publicación) {
 		Publicación = publicación;
 	}

}
