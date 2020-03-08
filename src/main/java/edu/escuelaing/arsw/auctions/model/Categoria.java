package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;

@Entity(name="categoria")
@Table(name="categoria")
public class Categoria implements Serializable{     
	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="id")
    	private int Id;
        
        @Column(name="categoria")
        private String Categoria; 
        
        @Column(name="marca")
        private String Marca;     
        
        public int getId() {
    		return Id;
    	}

    	public void setId(int ID) {
    		this.Id = ID;
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