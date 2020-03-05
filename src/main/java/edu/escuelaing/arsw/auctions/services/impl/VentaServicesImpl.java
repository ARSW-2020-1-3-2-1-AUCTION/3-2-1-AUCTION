package edu.escuelaing.arsw.auctions.services.impl;

import edu.escuelaing.arsw.auctions.Repository.VentaRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arsw.auctions.model.Venta;
import edu.escuelaing.arsw.auctions.persistance.AuctionNotFoundException;
import edu.escuelaing.arsw.auctions.persistance.AuctionPersistanceException;
import edu.escuelaing.arsw.auctions.services.VentaServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service("VentaServices")
public class VentaServicesImpl implements VentaServices {
        
        @Autowired
	private VentaRepository ventaRepo;
    
	@Override
	public List<Venta> getAllSales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta getVenta(int id) throws AuctionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveVenta(Venta venta) throws AuctionPersistanceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Venta findSaleByUser(String userName) throws AuctionPersistanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addVenta(Venta venta) {
		// TODO Auto-generated method stub

	}

}
