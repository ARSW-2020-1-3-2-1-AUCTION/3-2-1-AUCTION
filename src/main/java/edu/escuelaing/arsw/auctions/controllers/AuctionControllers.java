
package edu.escuelaing.arsw.auctions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author david.gonzalez-g
 */

@Controller
public class AuctionControllers {

    
	@GetMapping(value="")
	public String page() {
		return "login.html";
	}
    
}
    

