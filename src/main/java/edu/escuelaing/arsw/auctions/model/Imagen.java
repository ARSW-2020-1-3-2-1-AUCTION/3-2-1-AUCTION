package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class Imagen implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="ID")
	int ID;
	
	 public int getId() {
 		return ID;
 	}

 	public void setId(int ID) {
 		this.ID = ID;
 	}

}
