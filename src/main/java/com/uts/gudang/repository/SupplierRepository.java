/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.repository;

import com.uts.gudang.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author G
 */
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    
}
