/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
public class Racun{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "racunid")
    private Long racunId;
    
	@Column(name = "datumkupovine")
    private Date datumKupovine;
    
	@Column(name = "datumisporuke")
    private Date datumIsporuke;
    
	@Column(name = "iznos")
    private Long iznos;
    
    @OneToMany(mappedBy = "racun",
    		   cascade = CascadeType.ALL)
    private List<StavkaRacuna> stavke;
    
    @OneToOne(cascade = {CascadeType.DETACH,
			 CascadeType.MERGE,
			 CascadeType.PERSIST,
			 CascadeType.REFRESH } )
    @JoinColumn(name = "klijentid")
    private Klijent klijent;
    
    @OneToOne(cascade = {CascadeType.DETACH,
						 CascadeType.MERGE,
						 CascadeType.PERSIST,
						 CascadeType.REFRESH } )
    @JoinColumn(name = "ZaposleniID")
    private Zaposleni zaposleni;

    public Racun() {
        
    }

    public Racun(Long racunId, Date datumKupovine, Date datumIsporuke, Long iznos, List<StavkaRacuna> stavke, Klijent klijent, Zaposleni zaposleni) {
        this.racunId = racunId;
        this.datumKupovine = datumKupovine;
        this.datumIsporuke = datumIsporuke;
        this.iznos = iznos;
        this.stavke = stavke;
        this.klijent = klijent;
        this.zaposleni = zaposleni;
    }

    

    public Long getRacunId() {
        return racunId;
    }

    public void setRacunId(Long racunId) {
        this.racunId = racunId;
    }

    public Date getDatumKupovine() {
        return datumKupovine;
    }

    public void setDatumKupovine(Date datumKupovine) {
        this.datumKupovine = datumKupovine;
    }

    public Date getDatumIsporuke() {
        return datumIsporuke;
    }

    public void setDatumIsporuke(Date datumIsporuke) {
        this.datumIsporuke = datumIsporuke;
    }

    public Long getIznos() {
        return iznos;
    }

    public void setIznos(Long iznos) {
        this.iznos = iznos;
    }

    public List<StavkaRacuna> getStavke() {
        return stavke;
    }

    public void setStavke(List<StavkaRacuna> stavke) {
        this.stavke = stavke;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return klijent.getIme() + " " + klijent.getPrezime() + " datum kupovine:" +sdf.format(datumKupovine);
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
        final Racun other = (Racun) obj;
        if (this.racunId != other.racunId) {
            return false;
        }
        return true;
    }
   
}
