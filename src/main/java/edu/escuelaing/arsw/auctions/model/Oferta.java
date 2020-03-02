package edu.escuelaing.arsw.auctions.model;



import javax.persistence.Id;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

public class Oferta implements Serializable{     

	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="ID")
    	int ID;
        
        
        @Column(name="valorOfrecido")
        int valorOfrecido; 
        
        
        @Column(name="Fecha")
        Date Fecha;
        
        @Column(name="valorOfertaAutomatica")
        int valorOfertaAutomatica;
        
        @Column(name="ofertaAutomatica")
        boolean ofertaAutomatica;
        
        
        
	public int getId() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}
 
        public int getValorOfrecido() {
		return valorOfrecido;
	}

	public void setValorOfrecido(int valorOfrecido) {
		this.valorOfrecido = valorOfrecido;
	}
	
	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}
	public int getValorOfertaAutomatica() {
		return valorOfertaAutomatica ;
	}

	public void setValorOfertaAutomatica(int valorOfertaAutomatica) {
		this.valorOfertaAutomatica = valorOfertaAutomatica;
	}
	public boolean getOfertaAutomatica() {
		return ofertaAutomatica;
	}

	public void setOfertaAutomatica(boolean ofertaAutomatica) {
		this.ofertaAutomatica  = ofertaAutomatica;
	}
}