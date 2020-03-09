package edu.escuelaing.arsw.auctions.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.auctions.services.CategoriaServices;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController

public class CategoriaController {
	
	@Autowired
    @Qualifier("CategoriaServices")
    CategoriaServices cs;
	
 	@RequestMapping(method = RequestMethod.GET,value = "/categoria")
	    public ResponseEntity<?> getAllCategorias(){
	        try{
                    
	            return new ResponseEntity<>(cs.getAllCategorias(),HttpStatus.ACCEPTED);
	        }catch (Exception ex){
                    Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
 		
 	/* @RequestMapping(method = RequestMethod.POST)	
	    public ResponseEntity<?> manejadorPostRecursoCategoria(@RequestBody Categoria categoria){	        
	        try {
	            cs.addCategoria(categoria);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
 	*/ 
 	
	

}
