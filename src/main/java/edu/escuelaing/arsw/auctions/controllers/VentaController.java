package edu.escuelaing.arsw.auctions.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.auctions.model.Venta;

import edu.escuelaing.arsw.auctions.services.VentaServices;

@RestController
@RequestMapping(value = "/venta")

public class VentaController {
	
		@Autowired
	  @Qualifier("VentaServices")
	  VentaServices vs;
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllVentas(){
        try{
            return new ResponseEntity<>(vs,HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	 @RequestMapping(method = RequestMethod.POST)	
 public ResponseEntity<?> manejadorPostRecursoVenta(@RequestBody Venta venta){
     try {
         vs.addVenta(venta);
         return new ResponseEntity<>(HttpStatus.CREATED);
     } catch (Exception ex) {
         Logger.getLogger(OfertaController.class.getName()).log(Level.SEVERE, null, ex);
         return new ResponseEntity<>("Error al intentar crear el nuevo tiquete",HttpStatus.FORBIDDEN);            
     }
 }

}
