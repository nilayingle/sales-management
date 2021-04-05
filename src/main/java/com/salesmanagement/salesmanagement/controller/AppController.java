package com.salesmanagement.salesmanagement.controller;

import com.salesmanagement.salesmanagement.model.Product;
import com.salesmanagement.salesmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class AppController
{
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product)
    {
        productService.save(product);
    }

    @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
    public List<Product> getAllProducts()
    {
        List<Product> list = productService.listAll();
        return list;
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Long id)
    {
        Product product = productService.get(id);
        return product;
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
    public void updateProduct(@PathVariable Long id, @RequestBody Product product)
    {
        Product prod = productService.get(id);
        prod.setName(product.getName());
        prod.setBrand(product.getBrand());
        prod.setMadein(product.getMadein());
        prod.setPrice(product.getPrice());

        productService.save(prod);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable Long id)
    {
        productService.delete(id);
    }
}
