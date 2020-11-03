package com.fon.parfemi.service;

import java.util.List;

import com.fon.parfemi.domain.Grad;

public interface GradService {

	public Grad saveGrad(Grad grad);
	public List<Grad> getAllGrads();
	public Grad deleteGrad(Grad grad);
	public Grad updateGrad(Grad grad);
	public void deleteGradById(Long gradId);
	
}
