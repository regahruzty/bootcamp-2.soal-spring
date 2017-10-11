/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.model;

import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Diani
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "master_tiket", schema = "transportasi")
public class Tiket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Tiket(Penumpang idPenumpang, Travel idTravel) {
        this.idPenumpang = idPenumpang;
        this.idTravel = idTravel;
    }
   
    @OneToOne
    @JoinColumn (name = "id_penumpang", nullable = false)
    private Penumpang idPenumpang;
   
    @OneToOne
    @JoinColumn (name = "id_travel", nullable = false)
    private Travel idTravel;
  
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "jadwal", nullable = false)
    private java.util.Date jadwal;

   


}
