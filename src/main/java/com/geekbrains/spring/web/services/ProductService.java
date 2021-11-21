package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.data.Product;
import com.geekbrains.spring.web.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllStudents() {
        return productRepository.getAllProducts();
    }

    public void deleteProduct(Long id){
        productRepository.deleteProduct(id);
    }

    public void changeAmountForProduct(Long id, Integer delta) {
        productRepository.findById(id).setAmount(delta);
    }
}
