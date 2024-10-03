package com.inventario.inventariosum.service;

import com.inventario.inventariosum.modelo.Product;

import java.util.List;

public interface IProductService {
    public List<Product> listProducts();

    public Product getProductById(Integer idProduct);

    public Product addProduct(Product product);

    public void deleteProduct(Integer idProduct);
}
