package com.tabeldata.soal.springnama;

import com.tabeldata.soal.springnama.nama.UmurSaya;
import com.tabeldata.soal.springnama.nama.UmurSayaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NamaApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(NamaApplication.class, args);
                UmurSaya umurSaya = springContainer.getBean("umurSaya", UmurSaya.class);
                UmurSayaConfig umurSayaConfig = springContainer.getBean("umurSayaConfig", UmurSayaConfig.class);
                System.out.println(umurSaya.getUmur());
//              Atau
                System.out.println("saya ber usia " +umurSaya.getHanyaUmur()+ " tahun");
//              Config
                System.out.println(umurSayaConfig.getLine1() + umurSayaConfig.getUmurConfig() + umurSayaConfig.getLine2());

                
	
        
        
        }
}
