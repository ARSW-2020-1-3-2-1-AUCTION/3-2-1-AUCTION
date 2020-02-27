package edu.escuelaing.arsw.auctions.model;
import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable{     
	
    	@Id
        @Column(name="userName")
    	private String userName;
        
        
        @Column(name="Contrasena")
        private String Contrasena; 
        
        
        @Column(name="Saldo")
        private int Saldo;
        
        @Column(name="correoElectronico")
        private String correoElectronico;
        
        @Column(name="Puntuacion")
        private int Puntuacion;
        
        @Column(name="Comprados")
        private List Comprados;
        
        @Column(name="Vendidos")
        private List Vendidos;
        
        
        
        
	public String getUsername() {
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
	
	public List getComprados() {
		return Comprados;
	}

	public void setComprados(List Comprados) {
		this.Comprados = Comprados;
	}
	public List getVendidos() {
		return Vendidos;
	}

	public void setVendidos(List Vendidos) {
		this.Vendidos  = Vendidos;
	}
}