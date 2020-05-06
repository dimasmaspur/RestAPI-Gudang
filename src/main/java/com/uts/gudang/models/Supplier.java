/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name="tabel_supplier_6883")
public class Supplier {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_6883")
    private Long id_6883;
    
    @Column(name="nama_supplier_6883")
    private String nama_supplier_6883;
    
    @Column(name="alamat_supplier_6883")
    private String alamat_supplier_6883;
    
    @Column(name="telpon_supplier_6883")
    private String telpon_6883;
    
    @OneToMany(mappedBy="supplier")
    private List<Product> products_6883;
    
    
    public Supplier(){
        
    }

    public Supplier(Long id_6883, String nama_supplier_6883, String alamat_supplier_6883, String telpon_6883) {
        this.id_6883 = id_6883;
        this.nama_supplier_6883 = nama_supplier_6883;
        this.alamat_supplier_6883 = alamat_supplier_6883;
        this.telpon_6883 = telpon_6883;
    }

    public Long getId_6883() {
        return id_6883;
    }

    public void setId_6883(Long id_6883) {
        this.id_6883 = id_6883;
    }

    public String getNama_supplier_6883() {
        return nama_supplier_6883;
    }

    public void setNama_supplier_6883(String nama_supplier_6883) {
        this.nama_supplier_6883 = nama_supplier_6883;
    }

    public String getAlamat_supplier_6883() {
        return alamat_supplier_6883;
    }

    public void setAlamat_supplier_6883(String alamat_supplier_6883) {
        this.alamat_supplier_6883 = alamat_supplier_6883;
    }

    public String getTelpon_6883() {
        return telpon_6883;
    }

    public void setTelpon_6883(String telpon_6883) {
        this.telpon_6883 = telpon_6883;
    }

    public List<Product> getProducts_6883() {
        return products_6883;
    }

    public void setProducts_6883(List<Product> products_6883) {
        this.products_6883 = products_6883;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id_6883=" + id_6883 + ", nama_supplier_6883=" + nama_supplier_6883 + ", alamat_supplier_6883=" + alamat_supplier_6883 + ", telpon_6883=" + telpon_6883 + ", products_6883=" + products_6883 + '}';
    }

   
    
    
    
    
}
