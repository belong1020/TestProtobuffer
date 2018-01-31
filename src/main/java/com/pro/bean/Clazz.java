package com.pro.bean;

public class Clazz {

//	@Tag(1)
	private String clazzId;
//	@Tag(2)
	private String clazzName;

	public Clazz() {
	}
	
	public Clazz(String clazzId, String clazzName) {
		super();
		this.clazzId = clazzId;
		this.clazzName = clazzName;
	}

	public String getClazzId() {
		return clazzId;
	}

	public void setClazzId(String clazzId) {
		this.clazzId = clazzId;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}

	@Override
	public String toString() {
		return "Clazz [clazzId=" + clazzId + ", clazzName=" + clazzName + "]";
	}
	
	
}
