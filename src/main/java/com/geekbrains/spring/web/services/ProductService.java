package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.data.Product;
import com.geekbrains.spring.web.data.ProductDaoImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductDaoImpl productDao;

    public ProductService(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public void deleteProduct(Long id){
        productDao.deleteProduct(id);
    }

    public void changeAmountForProduct(Long id, Integer delta) {
        productDao.updateAmountById(id, delta);
    }
}
