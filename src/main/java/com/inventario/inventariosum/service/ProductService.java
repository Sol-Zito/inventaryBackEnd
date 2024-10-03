package com.inventario.inventariosum.service;

import com.inventario.inventariosum.modelo.Product;
import com.inventario.inventariosum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository pr;

    @Override
    public List<Product> listProducts() {
        return this.pr.findAll();
    }

    @Override
    public Product getProductById(Integer idProduct) {
        return this.pr.findById(idProduct).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        this.pr.save(product);
        return product;
    }

    @Override
    public void deleteProduct(Integer idProduct) {
        this.pr.deleteById(idProduct);
    }
}
