package com.application.module.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ExcelSheet")
public class Excel {
	@Id

	@Field("Primary_Workflow_id")
	private String primaryWorkflowId;
	@Field("Primary_Workflow_name")
	private String primaryWorkflowName;

	private List<SecWorkFlow> Secondary_Workflow;

	public String getPrimaryWorkflowId() {
		return primaryWorkflowId;
	}

	public void setPrimaryWorkflowid(String primaryWorkflowId) {
		this.primaryWorkflowId = primaryWorkflowId;
	}

	public String getprimaryWorkflowName() {
		return primaryWorkflowName;
	}

	public void setprimaryWorkflowName(String primaryWorkflowName) {
		this.primaryWorkflowName = primaryWorkflowName;
	}

	public List<SecWorkFlow> getSecondary_Workflow() {
		return Secondary_Workflow;
	}

	public void setSecondary_Workflow(List<SecWorkFlow> Secondary_Workflow) {
		this.Secondary_Workflow = Secondary_Workflow;
	}

}
