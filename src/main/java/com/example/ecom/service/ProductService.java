package com.example.ecom.service;

import com.example.ecom.model.Product;
import com.example.ecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts(){
        return repo.findAll();
    }
}
