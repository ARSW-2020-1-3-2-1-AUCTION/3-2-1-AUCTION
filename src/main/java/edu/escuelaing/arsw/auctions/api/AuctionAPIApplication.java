
package edu.escuelaing.arsw.auctions.api;

/**
 *
 * @author david.gonzalez-g
 */

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"edu.escuelaing.arsw.auctions"})
public class AuctionAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionAPIApplication.class, args);
	}
}
    

