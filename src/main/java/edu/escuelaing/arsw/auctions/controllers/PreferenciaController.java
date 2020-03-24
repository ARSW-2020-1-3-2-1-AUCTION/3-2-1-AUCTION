package edu.escuelaing.arsw.auctions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.auctions.services.PreferenciaServices;

@RestController
@RequestMapping(value = "/preferencia")
public class PreferenciaController {
	
	@Autowired
    @Qualifier("PreferenciaServicesImpl")
    PreferenciaServices preferencia;
	
	@RequestMapping(value="/ByUser/{IdUsuario}",method = RequestMethod.GET)
    public ResponseEntity<?> getByUser(@PathVariable(name="IdUsuario") String id){
        try{
        	return new ResponseEntity<>(preferencia.getPreferencias(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@RequestMapping(value="/{usuario}/{publicacion}",method = RequestMethod.POST)
    public ResponseEntity<?> savePreferencia(@PathVariable(name="usuario") String usuario,@PathVariable(name="publicacion") int publicacion){
        try{
        	preferencia.savePreferencia(usuario,publicacion);
        	return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
