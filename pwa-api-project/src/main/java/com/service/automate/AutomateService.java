package com.service.automate;

import java.util.List;

import com.model.automate.Automate;

public interface AutomateService {

	Automate findAutomateBySerialNumber(Long SerialNumber);
	List<Automate> findAllAutomate();
	Automate addAutomate(Automate automate);
	
	boolean existsAutomateBySerialNumber(Long SerialNumber);
	void deleteAutomateBySerialNumber(Long SerialNumber);
}
