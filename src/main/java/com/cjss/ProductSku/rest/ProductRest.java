package com.cjss.ProductSku.rest;


import com.cjss.ProductSku.model.Product;
import com.cjss.ProductSku.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRest {
    @Autowired
    private ProductService service;

    @PostMapping("/add")
    public void addOne(@RequestBody Product product){
        service.addOne(product);
    }
    @GetMapping("/getone")
    public Product getOne(@RequestParam String name){
       return  service.getOne(name);
    }
    @GetMapping("/getall")
    public List<Product> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/removeall")
    public void removeAll(){
        service.deleteProductAll();
    }
    @DeleteMapping("/removeone")
    public void removeOne(@RequestParam String id ){
        service.deleteOne(id);
    }


}
