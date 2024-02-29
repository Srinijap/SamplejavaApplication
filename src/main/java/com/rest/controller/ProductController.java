package com.rest.controller;

import com.rest.bean.Product;
import com.rest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private ProductService productService;

    @GetMapping(value="displayAllProducts")
    public List<Product> getListOfAllProducts(){
       return productService.getProducts();
    }
   @PostMapping
   public ResponseEntity<Product> createProduct(@RequestBody Product product)
   {
       Product createdProduct = productService.createProduct(product);
       return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
   }
   @PutMapping("/{id}")
   public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product newProduct)
   {
       Product updatedProduct = productService.updateProduct(id, newProduct);
       return ResponseEntity.ok(updatedProduct);
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteProduct(@PathVariable int id)
   {
       productService.deleteProduct(id);
       return ResponseEntity.noContent().build();
   }
}
