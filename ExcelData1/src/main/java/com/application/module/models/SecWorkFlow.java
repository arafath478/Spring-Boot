package com.application.module.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SecWorkFlow {
	@Field("name")
	private String name;
	@Field("Scenario")
	private String scenario;
	@Field("Add_Scenario")
	private String addScenario;
	@Field("impact")
	private String impact;
	@Field("Applicable")
	private String applicable;
	@Field("WBT")
	private String wbt;
	@Field("remarks")
	private String remarks;

	private List<VR> VR;
	private List<SBET> SBET;

	public SecWorkFlow() {
		super();
	}

	public SecWorkFlow(String name, String scenario, String addScenario, String impact, String applicable, String wbt,
			String remarks, List<VR> VR, List<SBET> SBET) {
		super();
		this.name = name;
		this.scenario = scenario;
		this.addScenario = addScenario;
		this.impact = impact;
		this.applicable = applicable;
		this.wbt = wbt;
		this.remarks = remarks;

		this.VR = VR;
		this.SBET = SBET;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		scenario = scenario;
	}

	public String getAddScenario() {
		return addScenario;
	}

	public void setAddScenario(String addScenario) {
		addScenario = addScenario;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getApplicable() {
		return applicable;
	}

	public void setApplicable(String applicable) {
		applicable = applicable;
	}

	public String getWBT() {
		return wbt;
	}

	public void setWBT(String wbt) {
		wbt = wbt;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

//	public String getRelatedLinks() {
//		return relatedLinks;
//	}
//
//	public void setRelatedLinks(String relatedLinks) {
//		this.relatedLinks = relatedLinks;
//	}

	public List<VR> getVR() {
		return VR;
	}

	public void setVR(List<VR> VR) {
		this.VR = VR;
	}

	public List<SBET> getSBET() {
		return SBET;
	}

	public void setSBET(List<SBET> SBET) {
		this.SBET = SBET;
	}

}
