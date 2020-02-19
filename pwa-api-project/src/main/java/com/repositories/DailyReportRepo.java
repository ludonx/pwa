package com.repositories;

import org.springframework.stereotype.Repository;

import com.model.DailyReport;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface DailyReportRepo extends JpaRepository<DailyReport,Long> {

	@Query(value = "SELECT * FROM daily_report WHERE serial_number =?1 ", nativeQuery = true)
	List<DailyReport> findDailyReportBySerialNumber_Repo(Long SerialNumber);
}
