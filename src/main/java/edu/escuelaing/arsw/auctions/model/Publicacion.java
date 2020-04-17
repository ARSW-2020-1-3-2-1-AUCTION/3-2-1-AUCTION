package edu.escuelaing.arsw.auctions.model;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity//(name="publicacion")
@Table(name="publicacion")
public class Publicacion implements Serializable{     

	private static final long serialVersionUID = 1L;
		@Id
        @Column(name="id")
		private Integer Id;     
        
        @Column(name="descripcion")
        String Descripcion;
        
        @Column(name="valor")
        int Valor;
        
        @Column(name="fecha_publicacion")
        Date fechaPublicacion;
        
        @Column(name="fecha_de_subasta")
        String fechadeSubasta;
        
        @Column(name="usado")
        boolean Usado;
        
        @Column(name="estado")
        String Estado;
        
        @Column(name="oferta")
        int Oferta;
        
    	@Column(name="categoria")
        int Categoria;
        
        @Column(name="usuario")
        String usuario;
        
        @Column(name="nombre")
        String Nombre;
        
        @Column(name="ubicacion")
        String Ubicacion;
        
        @Column(name="marca")
        String marca;
        
        @Column(name="imagen")
        String imagen;        
        
        @Column(name="tiempo")
        String tiempo;
        
        public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public int getID() {
			return Id;
		}

		public void setID(int iD) {
			Id = iD;
		}
		
		public String getTiempo() {
			return tiempo;
		}

		public void setTiempo(String tiempo) {
			this.tiempo = tiempo;
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

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
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
	public String getFechadeSubasta() {
		return fechadeSubasta ;
	}

	public void setFechadeSubasta(String fechadeSubasta) {
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
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}