/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author PC
 */
public class Parfem{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parfemid")
    private Long parfemId;
	
	@Column(name = "nazivparfema")
    private String naziv;
    
	@Column(name = "mililitraza")
    private int mililitraza;
    
	@Column(name = "cena")
    private Long cena;

    public Parfem() {
    }

    public Parfem(Long parfemId, String naziv, int mililitraza, Long cena) {
        this.parfemId = parfemId;
        this.naziv = naziv;
        this.mililitraza = mililitraza;
        this.cena = cena;
    }

    public Long getParfemId() {
        return parfemId;
    }

    public void setParfemId(Long parfemId) {
        this.parfemId = parfemId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getMililitraza() {
        return mililitraza;
    }

    public void setMililitraza(int mililitraza) {
        this.mililitraza = mililitraza;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return naziv + " " + mililitraza + "ml";
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
        final Parfem other = (Parfem) obj;
        if (this.parfemId != other.parfemId) {
            return false;
        }
        return true;
    }
    
}
