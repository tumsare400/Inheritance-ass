package com.capgemini.inheritance.main;

public class MarketingExecutive extends Employee {
    private double kilometerTravelled;
    private double  tourAllowance=5;
    private double telephoneAllowance=1500;
	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicsalary, double medical, double kilometerTravelled) {
		super(employeeId, employeeName, basicsalary, medical);
		this.kilometerTravelled=kilometerTravelled;
		
		
	}

	
    public double grossSalary() {
    	return (super.grossSalary()+tourAllowance*kilometerTravelled+telephoneAllowance);
    }
   
}
