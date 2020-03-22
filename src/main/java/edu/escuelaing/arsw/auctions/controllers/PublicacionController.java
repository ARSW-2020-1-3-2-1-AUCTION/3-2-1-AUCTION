package edu.escuelaing.arsw.auctions.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.auctions.model.Publicacion;
import edu.escuelaing.arsw.auctions.model.Usuario;
import edu.escuelaing.arsw.auctions.services.PublicacionServices;

@RestController
@RequestMapping(value = "/publicacion")
public class PublicacionController {
	
	 	@Autowired
	    @Qualifier("PublicacionServices")
	    PublicacionServices publication;
	 	
	 	@RequestMapping(method = RequestMethod.GET)
		    public ResponseEntity<?> getAllPublicaciones(){
		        try{
		        	return new ResponseEntity<>(publication.getAllPublicaciones(),HttpStatus.ACCEPTED);
		        }catch (Exception ex){
		            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
	 	
	 	
	 	@RequestMapping(value="/getById/{id}", method = RequestMethod.GET)
	    public ResponseEntity<?> getPublicaciones(@PathVariable(name="id") int id){
	        try{
	        	return new ResponseEntity<>(publication.getPublicacion(id),HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    } 	
	 	
	 	
	 	 @RequestMapping(method = RequestMethod.POST)	
		    public ResponseEntity<?> manejadorPostRecursoPublicacion(@RequestBody Publicacion publicacion){	        
		        try {
		        	publication.addPublicacion(publicacion);
		            return new ResponseEntity<>(HttpStatus.CREATED);
		        } catch (Exception ex) {
		            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
		        }        

		    }
	 	 
	 	 
	 	@RequestMapping(value="/ByUser/{IdUsuario}",method=RequestMethod.GET)
		public ResponseEntity<?> getPublicacionByUsuario(@PathVariable(name="IdUsuario") String IdUsuario){
			try {
				return new ResponseEntity<>(publication.getPublicacionByUsuario(IdUsuario),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	 
	 	
	 	@RequestMapping(value="/ByCategoria/{IdCategoria}",method=RequestMethod.GET)
	 	public ResponseEntity<?> getPublicacionByCategoria(@PathVariable(name="IdCategoria") int IdCategoria){
			try {
				return new ResponseEntity<>(publication.getPublicacionByCategoria(IdCategoria),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	 
	 	
	 	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE)
	    public ResponseEntity<?> deletePublicacion(@PathVariable (name = "id") int id) {
	    try {
	    	publication.deletePublicacion(id);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED); 
	    } catch (Exception e) {
	            Logger.getLogger(PublicacionController.class.getName()).log(Level.SEVERE, null, e);
	            return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
	    }
	}
	
}
