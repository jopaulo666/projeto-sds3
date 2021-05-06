package com.jopaulo.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jopaulo.dsvendas.dto.SaleDTO;
import com.jopaulo.dsvendas.entities.Sale;
import com.jopaulo.dsvendas.repository.SaleRepository;
import com.jopaulo.dsvendas.repository.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true) // garante que toda operação do banco seja resolvido nesse método
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll(); // deixa na memória todos os vendedores
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
