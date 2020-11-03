package com.fon.parfemi.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fon.parfemi.domain.Klijent;
import com.fon.parfemi.repository.KlijentRepository;
import com.fon.parfemi.service.KlijentService;

@Service
public class KlijentServiceImpl implements KlijentService {
	
	@Autowired
	private KlijentRepository klijentRepository;

	@Override
	public Klijent saveKlijent(Klijent klijent) {
		List<Klijent> list = new LinkedList<>();
		klijentRepository.findAll().forEach(list::add);
		
		boolean exists = list.stream().anyMatch((it) -> it.getKlijentId().equals(klijent.getKlijentId()));
		
		if(!exists)
			return klijentRepository.save(klijent);
		else
			return klijent;
	}

	@Override
	public List<Klijent> getAllKlijents() {
		List<Klijent> list = new LinkedList<>();
		klijentRepository.findAll().forEach(list::add);
		return list;
	}

	@Override
	public Klijent deleteKlijent(Klijent klijent) {
		List<Klijent> list = new LinkedList<>();
		klijentRepository.findAll().forEach(list::add);
		
		boolean exists = list.stream().anyMatch((it) -> it.getKlijentId().equals(klijent.getKlijentId()));
		
		if(!exists) {
			klijentRepository.delete(klijent);
			return klijent;
		}
		else
			return klijent;
	}

	@Override
	public Klijent updateKlijent(Klijent klijent) {
		List<Klijent> list = new LinkedList<>();
		klijentRepository.findAll().forEach(list::add);
		
		boolean exists = list.stream().anyMatch((it) -> it.getKlijentId().equals(klijent.getKlijentId()));
		
		if(!exists) {
			klijentRepository.delete(klijent);
			return klijent;
		}
		else
			return klijent;
	}

	@Override
	public void deleteKlijentById(Long klijentId) {
		klijentRepository.deleteById(klijentId);
	}

}
