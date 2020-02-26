package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.model.automate.Automate;
import com.service.automate.AutomateService;

@RestController
@RequestMapping(path = AutomateController.BASE_URL )
public class AutomateController {
	
	public static final String BASE_URL = "/pwa/services/automate";
	public static final String PathGetAllAutomates = "/all";
	public static final String PathGetAutomateBySerialNumber = "/serialNumber/{SerialNumber}";
	public static final String PathCheckAutomateBySerialNumber = "/Check/serialNumber/{SerialNumber}";

	public static final String PathAddAutomate = "/add";
	public static final String PathAddListAutomate = "/add/list";
	public static final String PathDeleteAutomate = "/delete/{SerialNumber}";
	public static final String PathDeleteAllAutomate = "/delete/all";
	
	@Autowired
	private AutomateService automateService;

	public AutomateController() {
		super();
	}
	public AutomateController(AutomateService automateService) {
		super();
		this.automateService = automateService;
	}
	
	@GetMapping(path=AutomateController.PathGetAllAutomates)
	public List<Automate> getAllAutomate(){
		return automateService.findAllAutomate();
	}
	
	@GetMapping(path=AutomateController.PathGetAutomateBySerialNumber)
	public Automate getAutomateBySerialNumber(@PathVariable Long SerialNumber){
		return automateService.findAutomateBySerialNumber(SerialNumber);
	}
	@GetMapping(path=AutomateController.PathCheckAutomateBySerialNumber)
	public Boolean CheckAutomateBySerialNumber(@PathVariable Long SerialNumber){
		return automateService.existsAutomateBySerialNumber(SerialNumber);
	}
	@PostMapping(path=AutomateController.PathAddAutomate)
	@ResponseStatus(HttpStatus.CREATED)
	public String addAutomate(@RequestBody Automate automate){
		Automate res =  automateService.addAutomate(automate);
		
		String msg; 
		if(res != null )msg = "Automate added ^.^" ;
		else msg = "Failed to add Automate !!! :(";
		return msg; 
	}
	
	@PostMapping(path=AutomateController.PathAddListAutomate)
	@ResponseStatus(HttpStatus.CREATED)
	public String addListAutomate(@RequestBody List<Automate> automates){
		List<Automate> res =  automateService.addListAutomate(automates);
		
		String msg; 
		if(res != null )msg = "Automate added ^.^" ;
		else msg = "Failed to add Automate !!! :(";
		return msg; 
	}
	
	@DeleteMapping(path=AutomateController.PathDeleteAutomate)
	public String deleteAutomateBySerialNumber(@PathVariable Long SerialNumber){
		automateService.deleteAutomateBySerialNumber(SerialNumber);
		return "Delete Completed";
	}
	
	@DeleteMapping(path=AutomateController.PathDeleteAllAutomate)
	public String deleteAllAutomate(){
		automateService.deleteAllAutomate();
		return "All Automate Have been Deleted";
	}

}
