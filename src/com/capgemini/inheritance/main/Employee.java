package com.capgemini.inheritance.main;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicsalary;
	private double medical;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double basicsalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicsalary = basicsalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double grossSalary() {
		double hra = 0.5*basicsalary;
		double grosssalary = basicsalary + hra + medical;
		return grosssalary;

	}

	public double netSalary() {
	
		double pt = 200;
		double pf = 0.12*basicsalary;
		double netsalary =grossSalary() - (pt + pf);
		return netsalary;

	}
}
