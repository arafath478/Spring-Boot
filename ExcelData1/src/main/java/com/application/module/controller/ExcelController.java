package com.application.module.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.module.models.Excel;
import com.application.module.repository.ExcelRepository;
import com.application.module.service.ExcelService;

@RestController
@RequestMapping("/excel")
public class ExcelController {

	Logger logger = LoggerFactory.getLogger(ExcelController.class);

	@Autowired
	ExcelService excelService;
	ExcelRepository excelRepository;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/primaryworkflow/{primaryWorkflowName}")
	public List<Excel> getByPrimaryWorkflowName(@PathVariable String primaryWorkflowName) {
		logger.info("getByPrimaryWorkflowName method from ExcelController is executed with parameter "
				+ primaryWorkflowName);
		return excelService.getByPrimaryWorkflowNameService(primaryWorkflowName);
	}

}
