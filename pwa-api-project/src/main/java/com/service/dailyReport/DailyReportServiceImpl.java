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
		return dailyReportRepo.save(dailyReport);
	}

	
}
