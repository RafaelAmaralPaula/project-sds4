package com.devsuperior.dssalesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dssalesapi.dto.SaleSuccessDTO;
import com.devsuperior.dssalesapi.dto.SaleSumDTO;
import com.devsuperior.dssalesapi.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.dssalesapi.dto.SaleSumDTO(obj.seller , SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	public List<SaleSumDTO> amountGroupedBySeller();
	
	
	@Query("SELECT new com.devsuperior.dssalesapi.dto.SaleSuccessDTO(obj.seller , SUM(obj.visited) ,"
			+ " SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	public List<SaleSuccessDTO> sucessGroupedBySeller();

}
