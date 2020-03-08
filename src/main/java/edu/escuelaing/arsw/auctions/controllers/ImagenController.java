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

import edu.escuelaing.arsw.auctions.model.Imagen;

import edu.escuelaing.arsw.auctions.services.ImagenServices;


@RestController
@RequestMapping(value = "/imagen")

public class ImagenController {
	
	@Autowired
    @Qualifier("ImagenServices")
    ImagenServices is;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllImagen(){
        try{
            return new ResponseEntity<>(is,HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	 @RequestMapping(method = RequestMethod.POST)	
	 public ResponseEntity<?> manejadorPostRecursoImagen(@RequestBody Imagen imagen){
	     try {
	         is.addImagen(imagen);
	         return new ResponseEntity<>(HttpStatus.CREATED);
	     } catch (Exception ex) {
	         Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
	         return new ResponseEntity<>("Error al intentar crear el nuevo tiquete",HttpStatus.FORBIDDEN);            
	     }
	 }
	 @RequestMapping(path = "/{imagenid}",method = RequestMethod.PUT)	
	    public ResponseEntity<?> PutAtraccion(@PathVariable ("imagenid") int id,@RequestBody Imagen im ){
	        
	        try {
	            is.updateOferta(im,id);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(ImagenController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
	        }
	    }
	 
	 @RequestMapping(path = "/{imagen}",method = RequestMethod.DELETE)
	    public ResponseEntity<?> deleteImagen(@PathVariable (name = "imagen") int id) {
	    try {
	        is.deleteImagen(id);
	        return new ResponseEntity<>(HttpStatus.ACCEPTED); 
	    } catch (Exception e) {
	            Logger.getLogger(ImagenController.class.getName()).log(Level.SEVERE, null, e);
	            return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
	    }
	}
}
