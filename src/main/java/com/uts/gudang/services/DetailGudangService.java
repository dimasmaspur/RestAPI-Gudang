/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.services;

import com.uts.gudang.models.DetailGudang;
import com.uts.gudang.exceptions.DetailGudangNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.uts.gudang.repository.DetailGudangRepository;

/**
 *
 * @author G
 */
@Service
public class DetailGudangService {
    
    
    @Autowired
    private DetailGudangRepository detailGudangRepository;
    
    public List<DetailGudang> getAllDetailGudang(){
        
      return  detailGudangRepository.findAll();
        
    }
    
    
//    create user
    public DetailGudang createDetailGudang(DetailGudang detailgudang){
        
        return detailGudangRepository.save(detailgudang);
    }
    
//    get by id
    public Optional<DetailGudang> getDetailGudangById(Long id_6883) throws DetailGudangNotFoundException{
        Optional<DetailGudang> detailgudang = detailGudangRepository.findById(id_6883);
        
        if(!detailgudang.isPresent()){
            throw new DetailGudangNotFoundException("Data Gudang tidak ada!");
        }
        return detailgudang;
    }
    
//    ini script untuk update
    public DetailGudang updateDetailGudangById(Long id_6883, DetailGudang detailgudang)throws DetailGudangNotFoundException{
       
        Optional<DetailGudang> optionalDetailGudang = detailGudangRepository.findById(id_6883);
        
        if(!optionalDetailGudang.isPresent()){
            throw new DetailGudangNotFoundException("Data Gudang tidak ada!");
        }
        
        detailgudang.setId_6883(id_6883);
        return detailGudangRepository.save(detailgudang);
    }
    
//    delete
    public void deleteDetailGudangById(Long id_6883){
         Optional<DetailGudang> optionalDetailGudang = detailGudangRepository.findById(id_6883);
        
        if(!optionalDetailGudang.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Data Gudang tidak ada!");
        }
        detailGudangRepository.deleteById(id_6883);
        
    }
    
}
