package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity//(name="preferencia")
@Table(name="preferencia")
public class Preferencia implements Serializable{     
	private static final long serialVersionUID = 1L;
		@Id        
        @Column(name="usuario")
        private String IdUsuario; 
        
        
        @Column(name="publicacion")
        private int IdPublicacion;     
        
        public String getIdUsuario() {
    		return IdUsuario;
    	}

    	public void setIdUsuario(String IdUsuario) {
    		this.IdUsuario = IdUsuario;
    	}
        
        public int getIdPublicacion() {
		return IdPublicacion;
	}

	public void setIdPublicacion(int IdPublicacion) {
		this.IdPublicacion = IdPublicacion;
	}
		
}