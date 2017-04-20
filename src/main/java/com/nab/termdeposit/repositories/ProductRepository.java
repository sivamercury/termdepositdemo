package com.nab.termdeposit.repositories;

import com.nab.termdeposit.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
