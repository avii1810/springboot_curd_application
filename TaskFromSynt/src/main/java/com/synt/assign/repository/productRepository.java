package com.synt.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synt.assign.enitiy.Product;

public interface productRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

