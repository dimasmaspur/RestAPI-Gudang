/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.controllers;

import com.uts.gudang.models.Product;
import com.uts.gudang.models.Supplier;
import com.uts.gudang.exceptions.SupplierNotFoundException;
import com.uts.gudang.repository.ProductRepository;
import com.uts.gudang.repository.SupplierRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author G
 */
@RestController
@Validated
public class ProductController {
    @Autowired
    private SupplierRepository supplierRepository;
    
    @Autowired
    private ProductRepository productRepository;
    
    
    @GetMapping("/gudang/barang")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    
//    get all orders berdasarkan id suplier
    @GetMapping("gudang/supplier/{supplierid}/barang")
    public List<Product> getAllproducts(@PathVariable Long supplierid) throws SupplierNotFoundException{
        
        Optional<Supplier> supplierOptional = supplierRepository.findById(supplierid);
        if(!supplierOptional.isPresent())
            throw new SupplierNotFoundException("Tidak ada data");
        
        return supplierOptional.get().getProducts_6883();
    }
    
    
//    membuat order
    @PostMapping("/gudang/supplier/{supplierid}/barang")
    public Product createProduct(@PathVariable Long supplierid, @RequestBody Product product) throws SupplierNotFoundException{
        Optional<Supplier> supplierOptional = supplierRepository.findById(supplierid);
//        if(!supplierOptional.isPresent())
//            throw new SupplierNotFoundException("Tidak ada data");
        
        Supplier supplier = supplierOptional.get();
        product.setSupplier(supplier);
        return productRepository.save(product);
    }
    
     @GetMapping("/gudang/barang/{id_6883}")
    public Optional<Product> getProductById(@PathVariable("id_6883") Long id_6883){
       Optional<Product> product = productRepository.findById(id_6883);
        
        if(!product.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        return product;
        
    }
    
    @PutMapping("/gudang/barang/{id_6883}")
    public Product updateProductById(@PathVariable("id_6883") Long id_6883,@RequestBody Product product){
        
       Optional<Product> optionalProduct = productRepository.findById(id_6883);
        
        if(!optionalProduct.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        product.setProductid_6883(id_6883);
        return productRepository.save(product);
        
    }
    
    @DeleteMapping("/gudang/barang/{id_6883}")
     public void deleteProductById(@PathVariable("id_6883") Long id_6883){
       Optional<Product> optionalProduct = productRepository.findById(id_6883);
       productRepository.deleteById(id_6883);
    }
    
}
