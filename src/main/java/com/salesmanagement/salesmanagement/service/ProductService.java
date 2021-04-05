package com.salesmanagement.salesmanagement.service;

import com.salesmanagement.salesmanagement.model.Product;
import com.salesmanagement.salesmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll()
    {
        return productRepository.findAll();
    }

    public void save(Product product)
    {
        productRepository.save(product);
    }

    public Product get(long id)
    {
        return productRepository.findById(id).get();
    }

    public void delete(long id)
    {
        productRepository.deleteById(id);
    }
}
