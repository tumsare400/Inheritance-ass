package com.capgemini.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.Employee;

public class EmployeeTest {

	private Employee employee;

	@BeforeEach
	public void setUp() {

		Employee employee = new Employee(11, "Payal", 50000, 100);
	}

	@Test
	public void testEmployeeDefaultConstructor() {
		Employee employee = new Employee();
	}

	@Test
	public void testEmployeeParameterizedConstructor() {
		Employee employee = new Employee(11, "Payal", 50000, 100);
		assertEquals(11, employee.getEmployeeId(), 0.01);
		assertEquals("Payal", employee.getEmployeeName());
		assertEquals(50000, employee.getBasicsalary(), 0.01);
		assertEquals(100, employee.getMedical(), 0.01);
	}

	public void testEmployeeGrosssalary() {
		assertEquals(75100, employee.grossSalary());
	}

	public void testEmployeeNetsalary() {
		assertEquals(80900, employee.netSalary());

	}
}
