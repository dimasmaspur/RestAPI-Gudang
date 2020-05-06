/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.repository;

import com.uts.gudang.models.DetailGudang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author G
 */
@Repository
public interface DetailGudangRepository extends JpaRepository<DetailGudang, Long>{
    
}
