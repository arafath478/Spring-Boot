package com.application.module.models;

import org.springframework.data.mongodb.core.mapping.Field;

public class VR {
	@Field("Name1")
	private String name1;
	@Field("Name2")
	private String name2;
	@Field("Name3")
	private String name3;

	public VR() {
		super();
	}

	public VR(String name1, String name2, String name3) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

}
