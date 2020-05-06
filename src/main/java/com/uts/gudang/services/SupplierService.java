/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.services;

import com.uts.gudang.models.Supplier;
import com.uts.gudang.exceptions.SupplierNotFoundException;
import com.uts.gudang.repository.SupplierRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author G
 */

@Service
public class SupplierService {
    
    @Autowired
    private SupplierRepository supplierRepository;
    
    public List<Supplier> getAllSupplier(){
        
      return  supplierRepository.findAll();
        
    }
    
    
//    create supplier
    public Supplier createSupplier(Supplier supplier){
        
        return supplierRepository.save(supplier);
    }
    
    
    //    get by id
    public Optional<Supplier> getSupplierById(Long id_6883) throws SupplierNotFoundException{
        Optional<Supplier> supplier = supplierRepository.findById(id_6883);
        
        if(!supplier.isPresent()){
            throw new SupplierNotFoundException("Supplier tidak ada!");
        }
        return supplier;
    }
    
//    ini script untuk update
    public Supplier updateSupplierById(Long id_6883, Supplier supplier)throws SupplierNotFoundException{
       
        Optional<Supplier> optionalSupplier = supplierRepository.findById(id_6883);
        
        if(!optionalSupplier.isPresent()){
            throw new SupplierNotFoundException("Supplier tidak ada! coba koreksi id nya");
        }
        
        supplier.setId_6883(id_6883);
        return supplierRepository.save(supplier);
    }
    
//    delete
    public void deleteSupplierById(Long id_6883){
         Optional<Supplier> optionalSupplier = supplierRepository.findById(id_6883);
        
        if(!optionalSupplier.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Supplier tidak ada! coba koreksi id nya");
        }
        supplierRepository.deleteById(id_6883);
        
    }
    
}
