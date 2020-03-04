package edu.escuelaing.arsw.auctions.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import edu.escuelaing.arsw.auctions.services.*;
import edu.escuelaing.arsw.auctions.model.Usuario;


@RestController
@RequestMapping(value="/usuario")

public class UsuarioController {
	
	  @Autowired
	  @Qualifier("UsuarioServices")
	  UsuarioServices user;
	  
	  @GetMapping
	    public ResponseEntity<?> getAllUser(){
	        try{
	            return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  

	    
	    @RequestMapping(path = "/{userName}", method = RequestMethod.GET)
	    public ResponseEntity<?> getUsuario(@PathVariable(name = "userName") int id) {
	        try {
	            Usuario usuario = user.getUsuario(id);
	            return new ResponseEntity<>(usuario, HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
	        }
	    }  

	  
	
	 @GetMapping(path = "/{usuarioEmail}")
	    public ResponseEntity<?> getUserByEmail(@PathVariable("usuario") String correoElectronico){
	        
	        try{
	            return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	        }
	    }
	 
	 @RequestMapping(method = RequestMethod.POST)	
	    public ResponseEntity<?> manejadorPostRecursoUsuario(@RequestBody Usuario usuario){	        
	        try {
	            user.addUser(usuario);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
	 


}
