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
import edu.escuelaing.arsw.auctions.services.PublicacionServices;

@RestController
@RequestMapping(value = "/publicacion")

public class PublicacionController {
	
	 	@Autowired
	    @Qualifier("PublicacionServices")
	    PublicacionServices ps;
	 	
	 	@RequestMapping(method = RequestMethod.GET)
		    public ResponseEntity<?> getAllPublicaciones(){
		        try{
		            return new ResponseEntity<>(ps,HttpStatus.ACCEPTED);
		        }catch (Exception ex){
		            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
	 	
	 	@RequestMapping(value="/{username}",method=RequestMethod.GET)
		public ResponseEntity<?> getPublicacionByUsuario(@PathVariable String username){
			try {
				return new ResponseEntity<>(ps.getPublicacionByUsuario(username),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	
	 	@RequestMapping(value="/{categoria}",method=RequestMethod.GET)
	 	public ResponseEntity<?> getPublicacionByCategoria(@PathVariable int id){
			try {
				return new ResponseEntity<>(ps.getPublicacionByCategoria(id),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	
	 	
	 	
	 	 @RequestMapping(method = RequestMethod.POST)	
		    public ResponseEntity<?> manejadorPostRecursoPublicacion(@RequestBody Publicacion publicacion){	        
		        try {
		            ps.addPublicacion(publicacion);
		            ps.savePublicacion(publicacion);
		            return new ResponseEntity<>(HttpStatus.CREATED);
		        } catch (Exception ex) {
		            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
		        }        

		    }
	 	 
	 	@RequestMapping(path = "/{publicacion}",method = RequestMethod.DELETE)
	    public ResponseEntity<?> deletePublicacion(@PathVariable (name = "publicacion") int publicacion) {
	    try {
	        ps.deletePublicacion(publicacion);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED); 
	    } catch (Exception e) {
	            Logger.getLogger(PublicacionController.class.getName()).log(Level.SEVERE, null, e);
	            return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
	    }
	}
	

}
