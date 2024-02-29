package com.rest.service;
import com.rest.bean.Product;
import com.rest.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    private ProductRepo productrepo;

    public List<Product> getProducts() {
        return productrepo.findAll();
    }
    public Product createProduct(Product product)
    { return productrepo.save(product); }
    public Product updateProduct(int id, Product newProduct)
    {
        if (productrepo.existsById(id)) {
            newProduct.setId(id);
            return productrepo.save(newProduct);
        } else {
            throw new NoSuchElementException("Product with ID " + id + " not found");
        }
    }
    public void deleteProduct(int id) {
        if (productrepo.existsById(id))
        {
            productrepo.deleteById(id);
        } else
        {
            throw new NoSuchElementException("Product with ID " + id + " not found");
        }
    }
}
