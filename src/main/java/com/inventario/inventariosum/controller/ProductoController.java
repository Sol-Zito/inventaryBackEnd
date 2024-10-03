package com.inventario.inventariosum.controller;

import com.inventario.inventariosum.modelo.Product;
import com.inventario.inventariosum.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/inventary-app
@RequestMapping("inventary-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoController {
    private static final Logger logger =
            LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductService productService;

    //http://localhost:8080/inventario-app/products
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        List<Product> products = productService.listProducts();
        logger.info("Products List:");
        products.forEach(product -> logger.info(product.toString()));
        return products;
    }

    @PostMapping("/saveProduct")
    public Product addProduct(@RequestBody Product product) {
        logger.info("product to save: {}", product);
        return this.productService.addProduct(product);
    }


    @GetMapping("/productById:{id}")
    public Product getProductById(Integer idProduct) {
        Product product = productService.getProductById(idProduct);
        logger.info("Product:");
        logger.info(product.toString());
        return product;
    }



    @DeleteMapping("/deleteProduct")
    public void deleteProduct(Integer idProduct) {
        productService.deleteProduct(idProduct);
        logger.info("Deleted product");
    }

}
