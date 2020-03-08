package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity(name="venta")
@Table(name="venta")
public class Venta implements Serializable{     
	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="id")
    	private int Id;
        
        
        @Column(name="vendedor")
        private int Vendedor; 
        
        
        @Column(name="comprador")
        private int Comprador;
        
        @Column(name="publicacion")
        private int Publicacion;  

		public int getId() {
    		return Id;
    	}

    	public void setId(int ID) {
    		this.Id = ID;
    	}
        
        public int getVendedor() {
		return Vendedor;
	}

	public void setVendedor(int Vendedor) {
		this.Vendedor = Vendedor;
	}
	
	public int getSComprador() {
		return Comprador;
	}

	public void setComprador(int Comprador) {
		this.Comprador = Comprador;
	}
	
	public int getPublicacion() {
		return Publicacion;
	}

	public void setPublicacion(int publicacion) {
		Publicacion = publicacion;
	}
	
}