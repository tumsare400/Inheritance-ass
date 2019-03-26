package com.capgemini.inheritance.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.Before;

import com.capgemini.inheritance.main.MarketingExecutive;

public class MarketingExecutiveTest {
   private MarketingExecutive marketing;
   
   @Before
   public void setUp() {
	   marketing=new MarketingExecutive(11,"Payal",50000,2000,100);
   }
   @Test
   public void testMarketingDefaultConstructor() {
	   MarketingExecutive marketing=new MarketingExecutive();
	   assertNotNull(marketing);
   }
   @Test
   public void testMarketingParameterizedConstructor() {
	   MarketingExecutive marketing=new MarketingExecutive(11,"Payal",50000,2000,100);
	   assertNotNull(marketing);
   }
   @Test
   public void testMarketingGrossSalary() {
	  assertEquals(79000, marketing.grossSalary(), 0.01);
   }
   @Test
   public void testMarketingNetSalary() {
	   assertEquals(72800, marketing.netSalary(), 0.01);
   }
}
