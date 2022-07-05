package com.application.module.models;

import org.springframework.data.mongodb.core.mapping.Field;

public class SBET {
	@Field("Name4")
	private String name4;
	@Field("Name5")
	private String name5;
	@Field("Name6")
	private String name6;

	public SBET() {
		super();
	}

	public SBET(String name4, String name5, String name6) {
		super();
		this.name4 = name4;
		this.name5 = name5;
		this.name6 = name6;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String nm4) {
		this.name4 = name4;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}

	public String getName6() {
		return name6;
	}

	public void setName6(String name6) {
		this.name6 = name6;
	}

}
