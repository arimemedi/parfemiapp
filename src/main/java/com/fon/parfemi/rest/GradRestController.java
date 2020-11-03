package com.fon.parfemi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fon.parfemi.domain.Grad;
import com.fon.parfemi.service.GradService;

@RestController
@RequestMapping("/gradovi")
public class GradRestController {
	
	@Autowired
	private GradService gradService;
	
	@GetMapping
	public List<Grad> getAllGradovi(){
		return gradService.getAllGrads();
	}
	
	@PostMapping
	public Grad saveGrad(@RequestBody Grad grad) {
		return gradService.saveGrad(grad);
	}
	
	@PutMapping
	public Grad updateGrad(@RequestBody Grad grad) {
		return gradService.updateGrad(grad);
	}
	
	@DeleteMapping
	public Grad deleteGrad(@RequestBody Grad grad) {
		return gradService.deleteGrad(grad);
	}
	
	@DeleteMapping("/{gradId}")
	public void deleteGradById(@PathVariable Long gradId) {
		gradService.deleteGradById(gradId);
	}

}
