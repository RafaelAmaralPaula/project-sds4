package com.devsuperior.dssalesapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dssalesapi.dto.SellerDTO;
import com.devsuperior.dssalesapi.entities.Seller;
import com.devsuperior.dssalesapi.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
	   List<Seller> result = sellerRepository.findAll();
	   return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	   
	}

}
