package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.model.DailyReport;
import com.service.automate.AutomateService;
import com.service.dailyReport.DailyReportService;



@RestController
@RequestMapping(path = DailyReportController.BASE_URL )
public class DailyReportController {

	public static final String BASE_URL = "/pwa/services/dailyReport";
	public static final String PathGetAllDailyReports = "/all";
	public static final String PathGetDailyReportBySerialNumber = "/serialNumber/{SerialNumber}";
	public static final String PathGetDailyReportById = "/{id}";

	public static final String PathAddDailyReport = "/add";
	//public static final String PathAddDailyReportXml = "/xml/add";
	
	@Autowired
	private DailyReportService dailyReportService;
	@Autowired
	private AutomateService automateService;

	public DailyReportController() {
		super();
	}

	public DailyReportController(DailyReportService dailyReportService) {
		super();
		this.dailyReportService = dailyReportService;
	}
	
	@GetMapping(path=DailyReportController.PathGetAllDailyReports)
	public List<DailyReport> getAllDailyReport(){
		return dailyReportService.findAllDailyReport();
	}
	
	@GetMapping(path=DailyReportController.PathGetDailyReportById)
	public DailyReport getDailyReportById(@PathVariable Long id){
		return dailyReportService.findDailyReportById(id);
	}
	@GetMapping(path=DailyReportController.PathGetDailyReportBySerialNumber)
	public List<DailyReport> getDailyReportSerialNumber(@PathVariable Long SerialNumber){
		return dailyReportService.findDailyReportBySerialNumber(SerialNumber);
	}
    @PostMapping(
    		path=DailyReportController.PathAddDailyReport,
    		consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
	//@PostMapping(path=DailyReportController.PathAddDailyReport)
	@ResponseStatus(HttpStatus.CREATED)
	public String addDailyReport(@RequestBody DailyReport dailyReport){
		String msg; 
		//AutomateController automateController = new AutomateController() ;
		
		Boolean  automate_exist = automateService.existsAutomateBySerialNumber(dailyReport.getSerial_number());
				// automateController.CheckAutomateBySerialNumber(dailyReport.getSerial_number());
		
		if (automate_exist == true) {
			DailyReport res = dailyReportService.addDailyReport(dailyReport);
			if(res != null )msg = "DailyReport added ^.^" ;
			else msg = "Failed to add DailyReport !!! :(";
		}else {
			msg = "Failed to add : automate with serial number ["+dailyReport.getSerial_number()+"] does not exist !!!";
		}
		
		return msg; 
	}
    
    /*@PostMapping(
    		path=DailyReportController.PathAddDailyReportXml,
    		consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE
    )
	//@PostMapping(path=DailyReportController.PathAddDailyReport)
	@ResponseStatus(HttpStatus.CREATED)
	public String addDailyReport_xml(@RequestBody DailyReport dailyReport){
		String msg; 
		//AutomateController automateController = new AutomateController() ;
		
		Boolean  automate_exist = automateService.existsAutomateBySerialNumber(dailyReport.getSerial_number());
				// automateController.CheckAutomateBySerialNumber(dailyReport.getSerial_number());
		
		if (automate_exist == true) {
			DailyReport res = dailyReportService.addDailyReport(dailyReport);
			if(res != null )msg = "DailyReport added ^.^" ;
			else msg = "Failed to add DailyReport !!! :(";
		}else {
			msg = "Failed to add : automate with serial number ["+dailyReport.getSerial_number()+"] does not exist !!!";
		}
		
		return msg; 
	}*/
}
