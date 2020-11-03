/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
public class Zaposleni{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "zaposleniid")
    private Long zaposleniId;
    
	@Column(name = "imezaposlenog")
    private String ime;
    
	@Column(name = "prezimezaposlenog")
    private String prezime;
    
	@Column(name = "datumrodjenjazaposlenog")
    private Date datumRodjenja;
    
	@Column(name = "korisnickoime")
    private String korisnickoIme;
    
	@Column(name = "lozinka")
    private String lozinka;
    
	@ManyToOne(cascade = {  CascadeType.DETACH,
							CascadeType.MERGE,
							CascadeType.PERSIST,
							CascadeType.REFRESH })
    @JoinColumn(name = "gradid")
    private Grad grad;

    public Zaposleni() {
    }

    public Zaposleni(Long zaposleniId, String ime, String prezime, Date datumRodjenja, String korisnickoIme, String lozinka, Grad grad) {
        this.zaposleniId = zaposleniId;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.grad = grad;
    }

    public Long getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(Long zaposleniId) {
        this.zaposleniId = zaposleniId;
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

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
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
        final Zaposleni other = (Zaposleni) obj;
        if (this.zaposleniId != other.zaposleniId) {
            return false;
        }
        return true;
    }
    

}
