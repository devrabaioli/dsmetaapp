package dev.rabaioli.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import dev.rabaioli.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
