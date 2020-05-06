/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.gudang.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G
 */

@Entity
@Table(name="detailgudang_6883")
public class DetailGudang {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_6883")
    private Long id_6883;
    
    @Column(name = "namagudang_6883", length=50,nullable=false)
    private String namagudang_6883;
    
    @Column(name = "operatorgudang_6883", length=50,nullable=false, unique=true)
    private String operatorgudang_6883;
    
    @Column(name = "alamatgudang_6883", length=50,nullable=false)
    private String alamatgudang_6883;
    
    
    
    @Column(name = "telpongudang_6883", length=20,nullable=false)
    private String telpongudang_6883;


    
    public DetailGudang(){
        
    }

    public DetailGudang(Long id_6883, String namagudang_6883, String operatorgudang_6883, String alamatgudang_6883, String telpongudang_6883) {
        this.id_6883 = id_6883;
        this.namagudang_6883 = namagudang_6883;
        this.operatorgudang_6883 = operatorgudang_6883;
        this.alamatgudang_6883 = alamatgudang_6883;
        this.telpongudang_6883 = telpongudang_6883;
    }

    public Long getId_6883() {
        return id_6883;
    }

    public void setId_6883(Long id_6883) {
        this.id_6883 = id_6883;
    }

    public String getNamagudang_6883() {
        return namagudang_6883;
    }

    public void setNamagudang_6883(String namagudang_6883) {
        this.namagudang_6883 = namagudang_6883;
    }

    public String getOperatorgudang_6883() {
        return operatorgudang_6883;
    }

    public void setOperatorgudang_6883(String operatorgudang_6883) {
        this.operatorgudang_6883 = operatorgudang_6883;
    }

    public String getAlamatgudang_6883() {
        return alamatgudang_6883;
    }

    public void setAlamatgudang_6883(String alamatgudang_6883) {
        this.alamatgudang_6883 = alamatgudang_6883;
    }

    public String getTelpongudang_6883() {
        return telpongudang_6883;
    }

    public void setTelpongudang_6883(String telpongudang_6883) {
        this.telpongudang_6883 = telpongudang_6883;
    }

    @Override
    public String toString() {
        return "DetailGudang{" + "id_6883=" + id_6883 + ", namagudang_6883=" + namagudang_6883 + ", operatorgudang_6883=" + operatorgudang_6883 + ", alamatgudang_6883=" + alamatgudang_6883 + ", telpongudang_6883=" + telpongudang_6883 + '}';
    }

   
    
    
}
