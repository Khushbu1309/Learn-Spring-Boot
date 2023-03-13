package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student_Info {
	private String Sname;
	private int SId;
	private String STech;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getSTech() {
		return STech;
	}
	public void setSTech(String sTech) {
		STech = sTech;
	}
	public void show() {
		System.out.println("student info class show method");
	}
	
	

}
