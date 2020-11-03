package com.fon.parfemi.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fon.parfemi.domain.Grad;
import com.fon.parfemi.repository.GradRepository;
import com.fon.parfemi.service.GradService;

@Service
public class GradServiceImpl implements GradService {

	@Autowired
	private GradRepository gradRepository;
	
	@Override
	public Grad saveGrad(Grad grad) {
		List<Grad> list = new LinkedList<>();
		gradRepository.findAll().forEach(list::add);
		
		boolean exists = list.stream().anyMatch((it) -> it.getNazivGrada().equals(grad.getNazivGrada()));
		
		if(!exists) 
			return gradRepository.save(grad);
		else 
			return grad;
				
	}

	@Override
	public List<Grad> getAllGrads() {
		List<Grad> list=new LinkedList<>();
		gradRepository.findAll().forEach(list::add);
		return list;
	}

	@Override
	public Grad deleteGrad(Grad grad) {
		List<Grad> list=new LinkedList<>();
		gradRepository.findAll().forEach(list::add);
		
		boolean exists=list.stream().anyMatch((it) -> it.getNazivGrada().equals(grad.getNazivGrada()));
		if(exists) { 
			 gradRepository.delete(grad);
			 return grad;
		}
		return null;
	}

	@Override
	public Grad updateGrad(Grad grad) {
		List<Grad> list=new LinkedList<>();
		gradRepository.findAll().forEach(list::add);
		
		boolean exists=list.stream().anyMatch((it) -> it.getNazivGrada().equals(grad.getNazivGrada()));
		
		if(exists) { 
			 gradRepository.save(grad);
			 return grad;
		}
		return null;
	}

	@Override
	public void deleteGradById(Long gradId) {
		 gradRepository.deleteById(gradId);
	}

}
