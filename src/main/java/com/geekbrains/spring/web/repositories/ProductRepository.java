package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.data.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>(List.of(
                new Product(1L, "Кокос", 1),
                new Product(2L, "Банан", 1),
                new Product(3L, "Апельсин", 1)
        ));
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(productList);
    }

    public void deleteProduct(Long id) {
        productList.removeIf(p -> p.getId().equals(id));
    }

    public Product findById(Long id) {
        return productList.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

}
