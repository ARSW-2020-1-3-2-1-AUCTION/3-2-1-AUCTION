
package edu.escuelaing.arsw.auction.controllers;

    import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author david.gonzalez-g
 */

@Controller
public class AuctionControllers {

    
	@GetMapping(value="/")
	public String page() {
		return "index";
	}
    
}
    

