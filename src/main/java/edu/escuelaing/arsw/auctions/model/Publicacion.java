package edu.escuelaing.arsw.auctions.model;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name="publicacion")
@Table(name="pulicacion")
public class Publicacion implements Serializable{     

	private static final long serialVersionUID = 1L;
		@Id
        @Column(name="id")
    	int ID;      
        
        @Column(name="descripcion")
        String Descripcion;
        
        @Column(name="valor")
        int Valor;
        
        @Column(name="fechaPublicacion")
        Date fechaPublicacion;
        
        @Column(name="fechaDeSubasta")
        Date fechadeSubasta;
        
        @Column(name="usado")
        boolean Usado;
        
        @Column(name="estado")
        String Estado;
        
        @Column(name="oferta")
        int Oferta;
        
    	@Column(name="categoria")
        int Categoria;
        
        @Column(name="usuario")
        int usuario;
        
        @Column(name="nombre")
        String Nombre;
        
        @Column(name="ubicacion")
        String Ubicacion;
        
        public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public int getOferta() {
			return Oferta;
		}

		public void setOferta(int oferta) {
			Oferta = oferta;
		}

		public int getCategoria() {
			return Categoria;
		}

		public void setCategoria(int categoria) {
			Categoria = categoria;
		}

		public int getUsuario() {
			return usuario;
		}

		public void setUsuario(int usuario) {
			this.usuario = usuario;
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