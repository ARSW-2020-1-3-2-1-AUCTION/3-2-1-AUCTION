
package edu.escuelaing.arsw.auctionsApi;

/**
 *
 * @author david.gonzalez-g
 */

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"edu.escuelaing.arsw.auctions"})
@EnableJpaRepositories("edu.eci.arsw.auctions.Repository")
@EntityScan("edu.eci.arsw.auctions.model")
public class AuctionAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionAPIApplication.class, args);
	}
}
    

