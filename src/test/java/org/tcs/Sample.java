package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	@BeforeClass
	public static  void beforeClass() {
	System.out.println("Launch Browser");

	}
	@AfterClass
    public static void afterClass() {
		System.out.println("Quit Browser");

	}
	@After
	public void after() {
		System.out.println("End Time");

	}
	@Before
	public void before() {
		System.out.println("Start Time");
	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
	System.out.println("Test 2");

	}
	
	// to ignore perticular test we use @Ignore
	@Ignore
	@Test
	public void test3() {
	System.out.println("Test 3");

	}
}
