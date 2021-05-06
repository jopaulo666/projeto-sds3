package com.jopaulo.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
