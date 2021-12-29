package com.cjss.ProductSku.service;

import com.cjss.ProductSku.model.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {
    Map<String, Product> productMap = new HashMap<String,Product>();

    public void addOne(Product product){
       productMap.put(product.getName(),product) ;
    }
    public Product getOne(String id){
        return productMap.get(id);
    }
    public  List<Product> getAll(){
        return  productMap.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
    }
    public void deleteProductAll(){
        productMap.clear();
    }
    public void  deleteOne(String id){
        productMap.remove(id);
    }
}
