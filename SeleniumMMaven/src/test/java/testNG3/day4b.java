package testNG3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4b {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void TestCaseOne() {
		System.out.println("Tescase one Pass");
	}

	@Test
	public void TestcaseTwo() {
		System.out.println("Test Case two Pass");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}
