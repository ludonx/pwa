package com.service.automate;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.automate.Automate;
import com.repositories.AutomateRepo;

@Service
public class AutomateServiceImpl implements AutomateService{
	private final AutomateRepo automateRepo;

	public AutomateServiceImpl(AutomateRepo automateRepo) {
		super();
		this.automateRepo = automateRepo;
	}

	@Override
	public Automate findAutomateBySerialNumber(Long SerialNumber) {
		return automateRepo.findById(SerialNumber).get();
	}

	@Override
	public List<Automate> findAllAutomate() {
		return automateRepo.findAll();
	}
	
	@Override
	public Automate addAutomate(Automate automate) {
		return automateRepo.save(automate);
	}
	
	@Override
	public List<Automate> addListAutomate(List<Automate> automates) {
		return automateRepo.saveAll(automates);
	}
	@Override
	public boolean existsAutomateBySerialNumber(Long SerialNumber) {
		return automateRepo.existsById(SerialNumber);
	}

	@Override
	public void deleteAutomateBySerialNumber(Long SerialNumber) {
		automateRepo.deleteById(SerialNumber);
		
	}

	@Override
	public void deleteAllAutomate() {
		automateRepo.deleteAll();
		
	}

	
	
	

}
