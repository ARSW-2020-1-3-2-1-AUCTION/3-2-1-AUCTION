
package edu.escuelaing.arsw.auctions.persistance;

/**
 *
 * @author david.gonzalez-g
 */
public class AuctionNotFoundException extends Exception {
    
     private static final long serialVersionUID = 1L;

    public AuctionNotFoundException(String message) {
        super(message);
    }

    public AuctionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
