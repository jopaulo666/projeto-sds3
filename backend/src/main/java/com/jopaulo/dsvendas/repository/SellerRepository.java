package com.jopaulo.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopaulo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
