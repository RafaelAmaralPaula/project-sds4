package com.devsuperior.dssalesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dssalesapi.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
