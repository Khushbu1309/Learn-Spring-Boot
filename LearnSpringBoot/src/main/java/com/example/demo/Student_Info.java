package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //singleton
//@Scope(value="prototype")
public class Student_Info {
	private String Sname;
	private int SId;
	private String STech;
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Student_Info() {
		super();
		System.out.println("Object created.");
	}
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
		laptop.compile();
	}
	
	

}
