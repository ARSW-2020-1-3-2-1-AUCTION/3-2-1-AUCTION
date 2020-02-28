package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;

@Entity(name="Categoria")
 @Table(name="Categoria")

public class Categoria implements Serializable{     
	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="ID")
    	private int ID;
        
        
        @Column(name="Categoria")
        private String Categoria; 
        
        
        @Column(name="Marca")
        private String Marca;     
        
        public int getId() {
    		return ID;
    	}

    	public void setId(int ID) {
    		this.ID = ID;
    	}
        
        public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String Categoria) {
		this.Categoria = Categoria;
	}
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
}