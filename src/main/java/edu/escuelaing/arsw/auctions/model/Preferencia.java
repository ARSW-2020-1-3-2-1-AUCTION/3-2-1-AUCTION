package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity//(name="preferencia")
@Table(name="preferencia")
public class Preferencia implements Serializable{     
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
    private int id; 
      
        @Column(name="usuario")
        private String usuario; 
        
        @Column(name="publicacion")
        private int publicacion; 
        

        public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public int getPublicacion() {
			return publicacion;
		}

		public void setPublicacion(int publicacion) {
			this.publicacion = publicacion;
		}    

		
}