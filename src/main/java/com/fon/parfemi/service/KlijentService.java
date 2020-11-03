package com.fon.parfemi.service;

import java.util.List;

import com.fon.parfemi.domain.Klijent;

public interface KlijentService {

	public Klijent saveKlijent(Klijent klijent);
	public List<Klijent> getAllKlijents();
	public Klijent deleteKlijent(Klijent klijent);
	public Klijent updateKlijent(Klijent klijent);
	public void deleteKlijentById(Long klijentId);
	
}
