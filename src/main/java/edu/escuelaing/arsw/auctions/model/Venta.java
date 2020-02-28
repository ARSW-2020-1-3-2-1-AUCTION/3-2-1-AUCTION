package edu.escuelaing.arsw.auctions.model;

import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;


public class Categoria implements Serializable{     
	private static final long serialVersionUID = 1L;


		@Id
        @Column(name="ID")
    	private int ID;
        
        
        @Column(name="Vendedor")
        private String Vendedor; 
        
        
        @Column(name="Comprador")
        private String Comprador;     
        
        public int getId() {
    		return ID;
    	}

    	public void setId(int ID) {
    		this.ID = ID;
    	}
        
        public String getVendedor() {
		return Vendedor;
	}

	public void setVendedor(String Vendedor) {
		this.Vendedor = Vendedor;
	}
	
	public String getSComprador() {
		return Comprador;
	}

	public void setComprador(String Comprador) {
		this.Comprador = Comprador;
	}
	
}