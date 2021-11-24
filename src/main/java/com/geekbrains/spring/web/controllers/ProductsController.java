package com.geekbrains.spring.web.controllers;

import com.geekbrains.spring.web.data.Product;
import com.geekbrains.spring.web.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts (){
        System.out.println("Запрос получен на обновление");
        return productService.getAllProducts();
    }

    @GetMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/change_amount")
    public void changeAmount(@RequestParam Long id, @RequestParam Integer delta){
        System.out.println("Запрос получен" + id + "   " + delta);
        productService.changeAmountForProduct(id, delta);
    }
}
