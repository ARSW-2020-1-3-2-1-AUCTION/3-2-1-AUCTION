package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name="oferta")
@Table(name="oferta")
public class Oferta implements Serializable{     

	private static final long serialVersionUID = 1L;

		@Id
        @Column(name="id")
    	int Id;
        
        @Column(name="valorOfrecido")
        int valorOfrecido; 
        
        @Column(name="fecha")
        Date Fecha;
        
        @Column(name="valorOfertaAutomatica")
        int valorOfertaAutomatica;
        
        @Column(name="ofertaAutomatica")
        boolean ofertaAutomatica;
        
        @Column(name="usuario")
        int usuario;

	public int getId() {
		return Id;
	}

	public void setId(int ID) {
		this.Id = ID;
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
	
	public int isUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
}