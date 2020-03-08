package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity(name="usuario")
@Table(name="usuario")
public class Usuario implements Serializable{     
	
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
        int id;
        
        @Column(name="contrasena")
        private String Contrasena; 
        
        @Column(name="saldo")
        private int Saldo;
        
        @Column(name="correoElectronico")
        private String correoElectronico;
        
        @Column(name="puntuacion")
        private int Puntuacion;
        
        @Column(name="userName")
    	private String userName;
        
        public Usuario() {
            
    	}
        
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}        
        
	public String getUserName() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}
        
        public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		this.Contrasena = contrasena;
	}
	
	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		this.Saldo = saldo;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setEmail(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.Puntuacion  = puntuacion;
	}
	
}