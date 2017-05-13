package com.frankmoley.landon.data.repository;

import com.frankmoley.landon.data.entity.Product;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}