package com.wipro;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int gardeLevel;
	private double gpa;
	private String gender;
	private List<String> activities=new ArrayList<>();
	
	
	public Student(String name, int gardeLevel, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gardeLevel = gardeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGardeLevel() {
		return gardeLevel;
	}
	public void setGardeLevel(int gardeLevel) {
		this.gardeLevel = gardeLevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gardeLevel=" + gardeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}
	
	
	

}
