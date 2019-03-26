package com.capgemini.inheritance.main;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int employeeId, String employeeName, double basicsalary, double medical) {
		super(employeeId, employeeName, basicsalary, medical);
		this.petrolAllowance=super.getBasicsalary()*0.08;
		this.foodAllowance=super.getBasicsalary()*0.13;
		this.otherAllowance=super.getBasicsalary()*0.03;

	}

	

	public double grossSalary() {
		return (super.grossSalary() + petrolAllowance + foodAllowance + otherAllowance);

	}

	
	}

