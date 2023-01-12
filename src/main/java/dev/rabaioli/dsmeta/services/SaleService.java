package dev.rabaioli.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import dev.rabaioli.dsmeta.entities.Sale;
import dev.rabaioli.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;

	@GetMapping
	public List<Sale> findSales() {
		return repo.findAll();
	
	}
}
