package com.service.dailyReport;

import java.util.List;

import com.model.DailyReport;


public interface DailyReportService {
	DailyReport findDailyReportById(Long id);
	List<DailyReport> findDailyReportBySerialNumber(Long SerialNumber);
	List<DailyReport> findAllDailyReport();
	DailyReport addDailyReport(DailyReport dailyReport);
	List<DailyReport> addListDailyReport(List<DailyReport> dailyReports);
	
	void deleteDailyReportById(Long id);
	void deleteAllDailyReport();
}
