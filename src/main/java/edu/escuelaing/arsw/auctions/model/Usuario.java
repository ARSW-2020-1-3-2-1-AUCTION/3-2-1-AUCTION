package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;


import java.io.Serializable;

@Entity//(name="usuario")
@Table(name="usuario")
public class Usuario implements Serializable{     
	
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;
        
        @Column(name="contrasena")
        private String contrasena; 
        
        @Column(name="saldo")
        private int saldo;
        
        @Column(name="puntuacion")
        private int puntuacion;
     
        public Usuario() {
            
    	}
        
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}        
        
        public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion  = puntuacion;
	}
	
}