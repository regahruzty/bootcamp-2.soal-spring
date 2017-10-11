package com.tabeldata.soal.spring;

import com.tabeldata.soal.spring.model.Penumpang;
import com.tabeldata.soal.spring.model.Tiket;
import com.tabeldata.soal.spring.model.Travel;
import com.tabeldata.soal.spring.no.spring.UmurSaya;
import com.tabeldata.soal.spring.no.spring.UmurSayaConfig;
import com.tabeldata.soal.spring.repository.PenumpangRepository;
import com.tabeldata.soal.spring.repository.TiketRepository;
import com.tabeldata.soal.spring.repository.TravelRepository;
import java.time.Instant;
import java.util.Date;
import org.hibernate.jpa.criteria.expression.function.CurrentTimeFunction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SoalSpringDiApplication {

	public static void main(String[] args) {
            
            
        ApplicationContext springContainer = SpringApplication.run(SoalSpringDiApplication.class, args);
        PenumpangRepository penumpangRepository = springContainer.getBean(PenumpangRepository.class);
        Penumpang penumpang = penumpangRepository.save(new Penumpang(1, "Lukman", "0812341234213", "Jl.Cisaranten"));
        Penumpang penumpang1 = penumpangRepository.save(new Penumpang(2, "Akbar", "0918234483343", "Jl.Melawai"));
        Penumpang penumpang2 = penumpangRepository.save(new Penumpang(3, "Dewa Ngoman", "0900934483343", "Jl.Panglima Polim"));
        Iterable<Penumpang> all = penumpangRepository.findAll();
//        all.forEach(penumpang ->{
//            System.out.println(penumpang.getId()); 
//            System.out.println(penumpang.getNama()); 
//            System.out.println(penumpang.getNoTelp()); 
//            System.out.println(penumpang.getAlamat());
//        });    
            
        TravelRepository travelRepository = springContainer.getBean(TravelRepository.class);
        Travel travel = travelRepository.save(new Travel(1, "Eko", "0813284343433", "Jl.Cisaranten", "D 2524 ZZC"));
        Travel travel1 = travelRepository.save(new Travel(2, "Budi", "0918234483343", "Jl.Melawai", "B 4343 KDF"));
        Travel travel2 = travelRepository.save(new Travel(3, "Adi Putra", "0900934483343", "Jl.Panglima Polim", "B 2343 DKJ"));
        Iterable<Travel> all1 = travelRepository.findAll();
//        all1.forEach(travel ->{
//            System.out.println(travel.getId()); 
//            System.out.println(travel.getNamaSupir()); 
//            System.out.println(travel.getNoTelp()); 
//            System.out.println(travel.getAlamat()); 
//            System.out.println(travel.getNoPolisi()); 
//        });
        
//            Penumpang penumpang = penumpangRepository.findOne(1);
//            Penumpang penumpang1 = penumpangRepository.findOne(2);
//            Penumpang penumpang2 = penumpangRepository.findOne(3);
//            
//            Travel travel = travelRepository.findOne(1);
//            Travel travel1 = travelRepository.findOne(2);
//            Travel travel2 = travelRepository.findOne(3);
//            
        TiketRepository tiketRepository = springContainer.getBean(TiketRepository.class);
        tiketRepository.save(new Tiket(1, penumpang, travel, Date.from(Instant.now())));
        tiketRepository.save(new Tiket(2, penumpang1, travel1, Date.from(Instant.now())));
        tiketRepository.save(new Tiket(3, penumpang2, travel2, Date.from(Instant.now())));
        Iterable<Tiket> all2 = tiketRepository.findAll();
//        all2.forEach(tiket ->{
//            System.out.println(tiket.getId()); 
//            System.out.println(tiket.getIdPenumpang()); 
//            System.out.println(tiket.getIdTravel()); 
//            System.out.println(tiket.getJadwal()); 
//        });
            
  
}          
}