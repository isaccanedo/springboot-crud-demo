package com.isaccanedo.repositories;

import com.isaccanedo.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
