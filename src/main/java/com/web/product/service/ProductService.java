package com.web.product.service;

import com.web.product.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(201, "Camon Camera", 60000),
            new Product(323, "Infinix", 54000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(
                        new Product(100, "No Item", 0)
                );
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
