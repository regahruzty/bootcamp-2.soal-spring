/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.springnama.nama;

import com.tabeldata.soal.springnama.KonfigurasiSoalSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Diani
 */
@Component
public class UmurSaya {
 
//    @Autowired
//    private final KonfigurasiSoalSpring umurConfig;
//
//    public UmurConfig(@Qualifier("getUmur") Integer umurConfig){
//    
//       return umurConfig;
//        
//    }
    
    private final Integer umur;
    
    public UmurSaya(@Value("20") Integer umur){
        
        this.umur = umur;
    }
    
    public String getUmur(){
    
        return "saya ber usia " + umur + " tahun.";
    }
    
    public Integer getHanyaUmur(){
    
        return umur;
    }
    
}
