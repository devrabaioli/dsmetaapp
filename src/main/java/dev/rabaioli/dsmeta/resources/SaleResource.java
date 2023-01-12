package dev.rabaioli.dsmeta.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.rabaioli.dsmeta.entities.Sale;
import dev.rabaioli.dsmeta.services.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleResource {
	
	@Autowired
	private SaleService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Sale> findSales(){
		return service.findSales();
	}

}
