package com.fon.parfemi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fon.parfemi.domain.Klijent;
import com.fon.parfemi.service.KlijentService;

@RestController
@RequestMapping("/klijenti")
public class KlijentRestController {

	@Autowired
	KlijentService klijentService;
	
	@GetMapping
	public List<Klijent> getAllKlijenti(){
		return klijentService.getAllKlijents();
	}
	
	@PostMapping
	public Klijent saveKlijent(@RequestBody Klijent klijent) {
		return klijentService.saveKlijent(klijent);
	}
	
	@PutMapping
	public Klijent updateKlijent(@RequestBody Klijent klijent) {
		return klijentService.updateKlijent(klijent);
	}
	
	@DeleteMapping
	public Klijent deleteKlijent(@RequestBody Klijent klijent) {
		return klijentService.deleteKlijent(klijent);
	}
	
	@DeleteMapping("/{klijentId}")
	public void deleteKlijentById(@PathVariable Long klijentId) {
		klijentService.deleteKlijentById(klijentId);
	}
	
	
	
	
}
