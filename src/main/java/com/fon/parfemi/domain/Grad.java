/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fon.parfemi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC
 */

@Entity
@Table(name = "grad")
public class Grad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gradid")
    private Long gradId;
	
	@Column(name = "nazivgrada")
    private String nazivGrada;
	
	@Column(name = "postanskibroj")
    private String postanskiBroj;

    public Grad() {
    }

    public Grad(Long gradId, String nazivGrada, String postanskiBroj) {
        this.gradId = gradId;
        this.nazivGrada = nazivGrada;
        this.postanskiBroj = postanskiBroj;
    }
    
    public Long getGradId() {
        return gradId;
    }

    public void setGradId(Long gradId) {
        this.gradId = gradId;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    @Override
    public String toString() {
        return nazivGrada;
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
        final Grad other = (Grad) obj;
        if (this.gradId != other.gradId) {
            return false;
        }
        return true;
    }
    
}
