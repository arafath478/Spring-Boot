package com.application.module.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.application.module.models.Excel;
import com.application.module.repository.ExcelRepository;

@Service
public class ExcelService {
	Logger logger = LoggerFactory.getLogger(ExcelService.class);
	@Autowired
	ExcelRepository excelRepository;

	public List<Excel> getAll() {
		return excelRepository.find();
	}

	public List<Excel> getByPrimaryWorkflowNameService(String primaryWorkflowName) {
		logger.info("getByPrimaryWorkflowName Method from ExcelService is executed with parameter " + primaryWorkflowName);
		return excelRepository.findByPrimaryWorkflowName(primaryWorkflowName);
	}

}
