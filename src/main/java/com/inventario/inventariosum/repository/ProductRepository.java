package com.inventario.inventariosum.repository;


import com.inventario.inventariosum.modelo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
