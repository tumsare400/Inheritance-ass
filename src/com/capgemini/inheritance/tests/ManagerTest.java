package com.capgemini.inheritance.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import com.capgemini.inheritance.main.Manager;

public class ManagerTest {
	private Manager manager;

	@Before
	public void setUp() {
	  manager = new Manager(11, "Payal", 50000, 2000);
	}

	@Test
	public void testManagerDefaultConstructor() {
		Manager manager = new Manager();
	}

	@Test
	public void testManagerParameterizedConstructor() {
       Manager manager=new Manager(11, "Payal", 50000, 2000);
	}
	@Test
	public void testManagerGrosssalary() {
		assertEquals(89000, manager.grossSalary(), 0.01);
	}
@Test
	public void testManagerNetSalary() {
		assertEquals(82800, manager.netSalary(), 0.01);
	}
}
