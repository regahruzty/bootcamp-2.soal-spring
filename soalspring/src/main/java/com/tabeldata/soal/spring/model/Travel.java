/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name = "master_travel", schema = "transportasi")
public class Travel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Travel(Integer id) {
        this.id = id;
    }
    
    @Column (name = "nama_supir")
    private String namaSupir;
    
    @Column (name = "no_telp")
    private String noTelp;
    
    @Column (name = "alamat")
    private String alamat;
    
    @Column (name = "no_polisi")
    private  String noPolisi;
    
    
    
}
