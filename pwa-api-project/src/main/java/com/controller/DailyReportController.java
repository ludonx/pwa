package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.model.DailyReport;
import com.service.dailyReport.DailyReportService;



@RestController
@RequestMapping(path = DailyReportController.BASE_URL )
public class DailyReportController {

	public static final String BASE_URL = "/pwa/services/dailyReport";
	public static final String PathGetAllDailyReports = "/all";
	public static final String PathGetDailyReportBySerialNumber = "/serialNumber/{SerialNumber}";
	public static final String PathGetDailyReportById = "/{id}";

	public static final String PathAddDailyReport = "/add";
	
	@Autowired
	private DailyReportService dailyReportService;


	public DailyReportController() {
		super();
	}

	public DailyReportController(DailyReportService dailyReportService) {
		super();
		this.dailyReportService = dailyReportService;
	}
	
	@GetMapping(path=DailyReportController.PathGetAllDailyReports)
	public List<DailyReport> getAllEquipe(){
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
	@PostMapping(path=DailyReportController.PathAddDailyReport)
	@ResponseStatus(HttpStatus.CREATED)
	public DailyReport addDailyReport(@RequestBody DailyReport dailyReport){
		return dailyReportService.addDailyReport(dailyReport);
	}
}
