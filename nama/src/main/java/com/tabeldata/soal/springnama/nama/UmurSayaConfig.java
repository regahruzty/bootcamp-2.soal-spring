/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.springnama.nama;

import com.tabeldata.soal.springnama.KonfigurasiSoalSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Diani
 */
@Component
public class UmurSayaConfig {
    
    @Autowired
    private final Integer umurSayaConfig;
    private final String line1;
    private final String line2;
    
    public UmurSayaConfig(@Qualifier("getUmur") Integer umurSayaConfig, @Qualifier("getLine1") String line1, @Qualifier("getLine2") String line2){
    
        this.umurSayaConfig = umurSayaConfig;
        this.line1 = line1;
        this.line2 = line2;
    }
    
    public Integer getUmurConfig(){
    return umurSayaConfig;
}

    public String getLine1(){
    return line1;
    }
    
    public String getLine2(){
    return line2;
    }
    
}
