package edu.escuelaing.arsw.auctions.services;

import java.util.List;


import edu.escuelaing.arsw.auctions.model.Venta;

import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;

public interface VentaServices {
	
	public List<Venta> getAllSales();

    public Venta getVenta(int id) throws AuctionNotFoundException;
    
    void saveVenta(Venta venta) throws AuctionPersistanceException;
    
    Venta findSaleByUser(String userName) throws AuctionPersistanceException;

	public void addVenta(Venta venta);
    
    

}
