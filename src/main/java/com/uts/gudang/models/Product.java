/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name ="tabel_product_6883")
public class Product {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productid_6883")
    private Long productid_6883;
    
    @Column(name = "nama_product_6883", length=50,nullable=false)
    private String nama_product_6883;
  
    
    @Column(name = "stok_6883")
    private String stok_6883;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Supplier supplier;
    
    public Product(){
        super();
    }

    public Product(Long productid_6883, String nama_product_6883, String stok_6883) {
        this.productid_6883 = productid_6883;
        this.nama_product_6883 = nama_product_6883;
        this.stok_6883 = stok_6883;
    }

    public Long getProductid_6883() {
        return productid_6883;
    }

    public void setProductid_6883(Long productid_6883) {
        this.productid_6883 = productid_6883;
    }

    public String getNama_product_6883() {
        return nama_product_6883;
    }

    public void setNama_product_6883(String nama_product_6883) {
        this.nama_product_6883 = nama_product_6883;
    }

    public String getStok_6883() {
        return stok_6883;
    }

    public void setStok_6883(String stok_6883) {
        this.stok_6883 = stok_6883;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    
    
}
