package com.devsuperior.dssalesapi.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dssalesapi.entities.Sale;

public class SaleDTO implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer visited;

	private Integer deals;

	private Double amount;

	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO() {}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entities) {
		id = entities.getId();
		visited = entities.getVisited();
		deals = entities.getDeals();
		amount = entities.getAmount();
		date = entities.getDate();
		seller = new SellerDTO(entities.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

}
