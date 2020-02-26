package com.service.automate;

import java.util.List;

import com.model.automate.Automate;

public interface AutomateService {

	Automate findAutomateBySerialNumber(Long SerialNumber);
	List<Automate> findAllAutomate();
	Automate addAutomate(Automate automate);
	List<Automate> addListAutomate(List<Automate> automates);
	
	boolean existsAutomateBySerialNumber(Long SerialNumber);
	void deleteAutomateBySerialNumber(Long SerialNumber);
	void deleteAllAutomate();
}
