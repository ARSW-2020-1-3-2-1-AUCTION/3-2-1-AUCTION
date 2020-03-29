package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity//(name="categoria")
@Table(name="categoria")
public class Categoria implements Serializable{     
	private static final long serialVersionUID = 1L;

	@Id
        @Column(name="id")
    	private Integer Id;
        
        @Column(name="nombre")
        private String nombre;
        
        public Categoria(Integer Id,String nombre){
            this.Id=Id;
            this.nombre=nombre;
        };
        
        public Categoria(){};
        
                
        public int getId() {
    		return Id;
    	}

    	public void setId(int ID) {
    		this.Id = ID;
    	}
        
        public String getnombre() {
		return nombre;
       }

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
}