package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity//(name="oferta")
@Table(name="oferta")
public class Oferta implements Serializable{     

	private static final long serialVersionUID = 1L;

		@Id
        @Column(name="id")
    	int Id;
        
        @Column(name="valor_ofrecido")
        int valorOfrecido; 
        
        @Column(name="fecha")
        Date Fecha;
        
        @Column(name="valor_oferta_automatica")
        int valorOfertaAutomatica;
        
        @Column(name="oferta_automatica")
        boolean ofertaAutomatica;
        
        @Column(name="usuario")
        String usuario;

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
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}