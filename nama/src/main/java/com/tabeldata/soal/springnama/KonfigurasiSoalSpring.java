/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.springnama;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Diani
 */
//                  Hanya Constructor diganti Value di ClassKoneksi
@Configuration
@ComponentScan(basePackages = "com.tabeldata.soal.spring.no.spring")
public class KonfigurasiSoalSpring {

    @Bean
    public Integer getUmur(){
        return 20;
    }
    
    @Bean
    public String getLine1(){
        return "Saya ber usia ";
    }
    
    @Bean
    public String getLine2(){
        return " tahun";
    }
}    
         
   