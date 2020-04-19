package edu.escuelaing.arsw.auctions.controllers;

import java.util.logging.Logger;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
	  
	  @RequestMapping(method = RequestMethod.GET)
	    public ResponseEntity<?> getAllUser(){
	        try{
	            return new ResponseEntity<>(user.getAllUsers(),HttpStatus.ACCEPTED);
	        }catch (Exception ex){
	        	Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  

	    
	    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
	    public ResponseEntity<?> getUsuario(@PathVariable(name = "id") String id) {
	        try {
	            Usuario usuario = user.getUsuario(id);
	            return new ResponseEntity<>(usuario, HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	        	ex.printStackTrace(System.out);
	            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    
	    @RequestMapping(path = "/getSaldo/{id}", method = RequestMethod.GET)
	    public ResponseEntity<?> getSaldo(@PathVariable(name = "id") String id) {
	        try {
	            int saldo = user.getSaldo(id);
	            return new ResponseEntity<>(saldo, HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	        	ex.printStackTrace(System.out);
	            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
	        }
	    }
	    
	
	    @RequestMapping(value = "/{id}/setSaldo/{saldo}", method = RequestMethod.GET)
	    public ResponseEntity<?> setSaldo(@PathVariable(name="id") String id,@PathVariable(name="saldo") int saldo) {
	        try {
	            
	            return new ResponseEntity<>(user.setSaldo(id,saldo),HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	        	ex.printStackTrace(System.out);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
	        }
	    }
	    
	    
	    @RequestMapping(value = "/{id}/setPuntuacion/{puntos}", method = RequestMethod.PUT)
	    public ResponseEntity<?> setPuntuacion(@PathVariable(name="id") int id,@PathVariable(name="puntos") int puntos) {
	        try {
	            user.setPuntuacion(id,puntos);
	            return new ResponseEntity<>(HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	        	ex.printStackTrace(System.out);
	            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
	        }
	    }
	    
	    @RequestMapping(method = RequestMethod.POST)	
	    public ResponseEntity<?> manejadorPostRecursoUsuario(@RequestBody Usuario usuario){
	        
	        try {
	            user.addUser(usuario);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
	    
	    @RequestMapping(value = "/saveUserCache", method = RequestMethod.POST)	
	    public ResponseEntity<?> postUsernameCache(@RequestBody Usuario usuario){
	        try {
	            user.postUsernameCache(usuario);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
	    
	    @RequestMapping(value = "/deleteUserCache/{user}", method = RequestMethod.DELETE)	
	    public ResponseEntity<?> deleteUsernameCache(@PathVariable(name="user") String usuario){
	        try {
	            user.deleteUsernameCache(usuario);
	            return new ResponseEntity<>(HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
	    
	    @RequestMapping(value = "/existUsername/{user}", method = RequestMethod.GET)	
	    public ResponseEntity<?> existUsername(@PathVariable(name="user") String usuario){
	        try {
	            return new ResponseEntity<>(user.existUsername(usuario), HttpStatus.CREATED);
	        } catch (Exception ex) {
	            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	        }        

	    }
	    
	    @RequestMapping(value = "/ofertaPermitida/{userName}/{ultimaOferta}/{cantidadAPujar}", method = RequestMethod.GET)
	    public ResponseEntity<?> ofertaPermitida(@PathVariable(name="userName") int userName, @PathVariable(name="ultimaOferta") int ultimaOferta, @PathVariable(name="cantidadAPujar") int cantidadAPujar) {
	        try {
	        
	            return new ResponseEntity<>(user.ofertaPermitida(userName,ultimaOferta,cantidadAPujar),HttpStatus.ACCEPTED);

	        } catch (Exception ex) {
	        	ex.printStackTrace(System.out);
	            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
	        }
	    }

}
