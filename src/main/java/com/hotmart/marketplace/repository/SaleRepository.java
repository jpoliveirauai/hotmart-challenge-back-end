package com.hotmart.marketplace.repository;

import com.hotmart.marketplace.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Long, Sale> {

}