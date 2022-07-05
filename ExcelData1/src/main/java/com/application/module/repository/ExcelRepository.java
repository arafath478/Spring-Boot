package com.application.module.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import com.application.module.models.Excel;

@Repository
public class ExcelRepository {
	Logger logger = LoggerFactory.getLogger(ExcelRepository.class);
	@Autowired
	MongoTemplate mongoTemplate;

	public List<Excel> find() {
		return mongoTemplate.findAll(Excel.class);
	}

	public List<Excel> findByPrimaryWorkflowName(String primaryWorkflowName) {
		logger.info("findByPrimaryWorkflowName Method from ExcelRepository is executed with parameter "+primaryWorkflowName);
		Query query = new Query(Criteria.where("primaryWorkflowName").regex(primaryWorkflowName));
		return mongoTemplate.find(query, Excel.class);
	}
}
