package org.example.productcatalogservicesept24.Controllers;

import org.example.productcatalogservicesept24.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(){

        return null;
    }

    @GetMapping("/products/{id}")
    //public Product getProductById(@PathVariable Long id){
    public Product getProductById(@PathVariable("id") Long productId){

        Product product = new Product();
        product.setId(productId);
        product.setTitle("Iphone16");
        product.setDescription(" Yet another same Iphone");
        product.setAmount(130000);
        return product;

    }

    // good practice says return the product created
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return null;

    }

}
