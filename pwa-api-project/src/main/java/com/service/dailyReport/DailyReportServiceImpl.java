package com.service.dailyReport;


import java.util.List;

import org.springframework.stereotype.Service;

import com.model.DailyReport;

import com.repositories.DailyReportRepo;



@Service
public class DailyReportServiceImpl implements  DailyReportService{
	private final DailyReportRepo dailyReportRepo;
	
	
	public DailyReportServiceImpl(DailyReportRepo dailyReportRepo) {
		super();
		this.dailyReportRepo = dailyReportRepo;
	}
	
	@Override
	public DailyReport findDailyReportById(Long id) {
		return dailyReportRepo.findById(id).get();
	}
	@Override
	public List<DailyReport> findDailyReportBySerialNumber(Long SerialNumber) {
		return dailyReportRepo.findDailyReportBySerialNumber_Repo(SerialNumber);
	}
	@Override
	public List<DailyReport> findAllDailyReport(){
		return dailyReportRepo.findAll();
	}

	@Override
	public DailyReport addDailyReport(DailyReport dailyReport) {
		//List<ErrorReport> error_x = dailyReport.getErrors();
		//error_x.get(0).getDaily_report_id().setId((long)1);
		//error_x.get(0).setDescription("new desc");
		/*
		if( dailyReport.getErrors().size() > 0) {
			dailyReport.getErrors().stream().forEach( 
					errorItem -> {errorItem.setDaily_report_id(dailyReport);});
		}
		
		DailyReport newdailyReport = new DailyReport(dailyReport.getSerial_number());

		List< ErrorReport > errorList = new ArrayList<>();

		for (ErrorReport error : dailyReport.getErrors()) {
			errorList.add( new ErrorReport(error.getType(),error.getDescription(), newdailyReport ) ) ;
		}

		newdailyReport.setErrors(errorList);
		 */
		return dailyReportRepo.save(dailyReport);
	}

	@Override
	public void deleteDailyReportById(Long id) {
		dailyReportRepo.deleteById(id);
	}

	@Override
	public List<DailyReport> addListDailyReport(List<DailyReport> dailyReports) {
		return dailyReportRepo.saveAll(dailyReports);
	}

	@Override
	public void deleteAllDailyReport() {
		dailyReportRepo.deleteAll();
		
	}

	
}
