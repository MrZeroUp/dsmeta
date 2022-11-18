package com.devmr.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmr.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
