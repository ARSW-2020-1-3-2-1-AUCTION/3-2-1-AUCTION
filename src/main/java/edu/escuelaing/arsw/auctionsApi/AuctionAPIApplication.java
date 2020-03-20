
package edu.escuelaing.arsw.auctionsApi;

/**
 *
 * @author david.gonzalez-g
 */

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages  = {"edu.escuelaing.arsw.auctions.services","edu.escuelaing.arsw.auctions.controllers","edu.escuelaing.arsw.auctions.cache"})
@EnableJpaRepositories("edu.escuelaing.arsw.auctions.Repository")
@EntityScan("edu.escuelaing.arsw.auctions.model")
public class AuctionAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionAPIApplication.class, args);
        /*        
        String URL = "jdbc:postgresql://ec2-52-86-33-50.compute-1.amazonaws.com:5432/d35e1d5us90cuf?user=ucmjkxdlkqmgfk&password=499a84f312d74b7f5607b6fb20b97da9b7e9c7629b23e70eeafd2f1f95092e34&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
        String USER = "ucmjkxdlkqmgfk";
        String PASSWORd = "499a84f312d74b7f5607b6fb20b97da9b7e9c7629b23e70eeafd2f1f95092e34"; 
        Connection c = null;  
        try {    
            Class.forName("org.postgresql.Driver");    
            System.out.println("Driver found");    
            System.out.println("Connecting..."); 
            c = DriverManager.getConnection(URL, USER, PASSWORd);    
        } catch (Exception e) {    
            System.out.println("Cannot connect the database");   
        } finally {    
            if (c != null) {       
                try {        
                    c.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AuctionAPIApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }*/    
    }         
	
	
}
    

