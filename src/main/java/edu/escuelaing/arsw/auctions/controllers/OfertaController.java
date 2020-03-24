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

import edu.escuelaing.arsw.auctions.model.Oferta;
import edu.escuelaing.arsw.auctions.services.OfertaServices;

@RestController
@RequestMapping(value = "/oferta")
public class OfertaController {
	
	  @Autowired
	  @Qualifier("OfertaServices")
	  OfertaServices os;
	  

	 	@RequestMapping(method = RequestMethod.GET)
		    public ResponseEntity<?> getAllOfertas(){
		        try{
		            return new ResponseEntity<>(os,HttpStatus.ACCEPTED);
		        }catch (Exception ex){
		            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
	 	
		@RequestMapping(value="/getById/{id}", method = RequestMethod.GET)
	    public ResponseEntity<?> getPublicaciones(@PathVariable(name="id") int id){
	        try{
	        	return new ResponseEntity<>(os.getOferta(id),HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
		
		@RequestMapping(value="/getUsuarioById/{id}", method = RequestMethod.GET)
	    public ResponseEntity<?> getUsuarioById(@PathVariable(name="id") int id){
	        try{
	        	return new ResponseEntity<>(os.getUsuarioById(id),HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 	
	 	@RequestMapping(value="/ByPublicacion/{IdPublicacion}",method=RequestMethod.GET)
	 	public ResponseEntity<?> getPublicacionByCategoria(@PathVariable(name="IdPublicacion") int IdPublicacion){
			try {
				return new ResponseEntity<>(os.getOfertaByPublicacion(IdPublicacion),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	
	 	@RequestMapping(value="/ByUser/{IdUsuario}",method=RequestMethod.GET)
		public ResponseEntity<?> getPublicacionByUsuario(@PathVariable(name="IdUsuario") String IdUsuario){
			try {
				return new ResponseEntity<>(os.getOfertaByUsuario(IdUsuario),HttpStatus.ACCEPTED);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}
	 	
	 	 @RequestMapping(method = RequestMethod.POST)	
	     public ResponseEntity<?> manejadorPostRecursoOferta(@RequestBody Oferta oferta){
	         try {
	        	 //System.out.println("oferta es: "+oferta.getUsuario());
	             return new ResponseEntity<>(os.addOferta(oferta),HttpStatus.CREATED);
	         } catch (Exception ex) {
	             Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
	             return new ResponseEntity<>("Saldo insuficiente",HttpStatus.FORBIDDEN);            
	         }
	     }
	 	
	 	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)	
	    public ResponseEntity<?> PutOferta(@PathVariable ("id") int id,String usuario,@RequestBody Oferta of ){
	        
	        try {
	            os.updateOferta(of,id);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
	        }
	    }

}
