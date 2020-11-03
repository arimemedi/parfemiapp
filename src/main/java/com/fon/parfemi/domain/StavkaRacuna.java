/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
public class StavkaRacuna{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stavkaid")
    private Long stavkaId;
    
	@Column(name = "rbr")
    private int rbr;
    
	@Column(name = "kolicina")
    private int kolicina;
    
	@Column(name = "iznosstavke")
    private Long iznos;
    
	@OneToOne(cascade = {CascadeType.DETACH,
			 			 CascadeType.MERGE,
			 			 CascadeType.PERSIST,
			 			 CascadeType.REFRESH } )
   @JoinColumn(name = "parfemid")
    private Parfem parfem;
    
    @ManyToOne(cascade = {  CascadeType.DETACH,
							CascadeType.MERGE,
							CascadeType.PERSIST,
							CascadeType.REFRESH })
    @JoinColumn(name = "racunid")
    private Racun racun;
    

    public StavkaRacuna() {
    }

    public StavkaRacuna(Long stavkaId, int rbr, int kolicina, Long iznos, Parfem parfem, Racun racun) {
        this.stavkaId = stavkaId;
        this.rbr = rbr;
        this.kolicina = kolicina;
        this.iznos = iznos;
        this.parfem = parfem;
        this.racun = racun;
    }

    public Long getStavkaId() {
        return stavkaId;
    }

    public void setStavkaId(Long stavkaId) {
        this.stavkaId = stavkaId;
    }

    public int getRbr() {
        return rbr;
    }

    public void setRbr(int rbr) {
        this.rbr = rbr;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Long getIznos() {
        return iznos;
    }

    public void setIznos(Long iznos) {
        this.iznos = iznos;
    }

    public Parfem getParfem() {
        return parfem;
    }

    public void setParfem(Parfem parfem) {
        this.parfem = parfem;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    @Override
    public String toString() {
        return "racun:" + racun.toString() + ", stavka:" + parfem.toString() + ", kolicina:" + kolicina;
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
        final StavkaRacuna other = (StavkaRacuna) obj;
        if (this.stavkaId != other.stavkaId) {
            return false;
        }
        return true;
    }
      
    
}
