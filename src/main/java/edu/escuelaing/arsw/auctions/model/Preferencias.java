package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;


public class Preferencias implements Serializable{     
	private static final long serialVersionUID = 1L;
		@Id        
        @Column(name="IdUsuario")
        private int IdUsuario; 
        
        
        @Column(name="IdPublicacion")
        private int IdPublicacion;     
        
        public int getIdUsuario() {
    		return IdUsuario;
    	}

    	public void setIdUsuario(int IdUsuario) {
    		this.IdUsuario = IdUsuario;
    	}
        
        public int getIdPublicacion() {
		return IdPublicacion;
	}

	public void setIdPublicacion(int IdPublicacion) {
		this.IdPublicacion = IdPublicacion;
	}
		
}