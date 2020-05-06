/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.controllers;

import com.uts.gudang.models.DetailGudang;
import com.uts.gudang.exceptions.DetailGudangNotFoundException;
import com.uts.gudang.services.DetailGudangService;
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
@RequestMapping(value="/gudang/details")
public class DetailGudangController {
    
    @Autowired
    private DetailGudangService detailGudangService;
    
//    cari semua user
    @GetMapping
    public List<DetailGudang> getAllDetailGudang(){
        return detailGudangService.getAllDetailGudang();
    }
    
//    buat user
    
    @PostMapping
    public DetailGudang createDetailGudang(@RequestBody DetailGudang detailgudang){
        return detailGudangService.createDetailGudang(detailgudang);
    }
    
//    ambil user berdasarkan id
    @GetMapping("/{id_6883}")
    public Optional<DetailGudang> getDetailGudangById(@PathVariable("id_6883") Long id_6883){
        
        try{
            return detailGudangService.getDetailGudangById(id_6883);
        }catch(DetailGudangNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
            
        }
        
    }
    
//    update data
    @PutMapping("/{id_6883}")
    public DetailGudang updateDetailGudangById(@PathVariable("id_6883") Long id_6883,@RequestBody DetailGudang detailgudang){
        
        try{
            
            return detailGudangService.updateDetailGudangById(id_6883, detailgudang);
        }catch(DetailGudangNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        
    }
//    delete
    @DeleteMapping("/{id_6883}")
    public void deleteDetailGudangById(@PathVariable("id_6883") Long id_6883){
        detailGudangService.deleteDetailGudangById(id_6883);
    }
}
