/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.auction.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/auction")

/**
 *
 * @author david.gonzalez-g
 */
public class AuctionAPIController {
	
    
	 //@Autowired 
    
	 @RequestMapping(method = RequestMethod.GET)
	    public ResponseEntity<?> manejadorGetRecursoBlueprintAPI(){
		    try {
		    	String data = "dsgerhg";
		        return new ResponseEntity<>(data,HttpStatus.ACCEPTED);
		    } catch (Exception ex) {
		        return new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
		    }  
		    
	    }
	
}
