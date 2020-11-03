/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "klijent")
public class Klijent{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "klijentid")
    private Long klijentId;
	
	@Column(name = "imeklijenta")
    private String ime;
    
	@Column(name = "prezimeklijenta")
    private String prezime;
    
	@Column(name = "datumrodjenjaklijenta")
    private Date datumRodjenja;
    
	@Column(name = "ulica")
    private String ulica;
    
	@ManyToOne(cascade = {  CascadeType.DETACH,
							CascadeType.MERGE,
							CascadeType.PERSIST,
							CascadeType.REFRESH })
	@JoinColumn(name = "GradID")
    private Grad grad;

    public Klijent() {
    }

    public Klijent(Long klijentId, String ime, String prezime, Date datumRodjenja, String ulica, Grad grad) {
        this.klijentId = klijentId;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.ulica = ulica;
        this.grad = grad;
    }

    public Long getKlijentId() {
        return klijentId;
    }

    public void setKlijentId(Long klijentId) {
        this.klijentId = klijentId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Klijent other = (Klijent) obj;
        if (this.klijentId != other.klijentId) {
            return false;
        }
        return true;
    }
    
}
