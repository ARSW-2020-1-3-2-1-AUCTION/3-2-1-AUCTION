package edu.escuelaing.arsw.auctions.model;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

public class Publicacion implements Serializable{     
	
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="ID")
    	int ID;
        
        
        @Column(name="Nombre")
        String Nombre; 
        
        
        @Column(name="Descripcion")
        String Descripcion;
        
        @Column(name="Valor")
        int Valor;
        
        @Column(name="fechaPublicacion")
        Date fechaPublicacion;
        
        @Column(name="fechadeSubasta")
        Date fechadeSubasta;
        
        @Column(name="Estado")
        String Estado;
        
        @Column(name="Usado")
        boolean Usado;
        
        @Column(name="Ubicacion")
        String Ubicacion;
        
        
	public int getId() {
		return ID;
	}

	public void setUsername(int ID) {
		this.ID = ID;
	}
 
        public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre= Nombre;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	public Date getFechadeSubasta() {
		return fechadeSubasta ;
	}

	public void setFechadeSubasta(Date fechadeSubasta) {
		this.fechadeSubasta = fechadeSubasta;
	}
	
	public Date getFechaPublicacion() {
		return fechaPublicacion ;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public int getValor() {
		return Valor;
	}

	public void setValor(int Valor) {
		this.Valor  = Valor;
	}	
	
	
	
	public String getEstado() {
		return Estado ;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}
	
	public boolean getUsado() {
		return Usado ;
	}

	public void setUsado(boolean Usado) {
		this.Usado = Usado;
	}
	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String Ubicacion) {
		this.Ubicacion  = Ubicacion;
	}
	
	
}