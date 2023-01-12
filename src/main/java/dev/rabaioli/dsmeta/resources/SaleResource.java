package dev.rabaioli.dsmeta.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.rabaioli.dsmeta.entities.Sale;
import dev.rabaioli.dsmeta.services.SaleService;
import dev.rabaioli.dsmeta.services.SmsService;

@RestController
@RequestMapping(value="/sales")
public class SaleResource {
	
	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable page
			){
		return service.findPages(minDate, maxDate, page);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}

}
