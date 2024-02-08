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

public class day3c {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");// 1
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");// 2
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("before Class");// 3
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will run Every test Case ");// 4//7
	}

	@Test
	public void TestCaseOne() {
		System.out.println("Test Case one Pass");// 5
	}

	@Test
	public void TestCaseTwo() {
		System.out.println("Test Case Two Pass ");// 8
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("I will run After Every test Case ");// 6//9
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("after class");// 10
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("after test");// 11
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("after Suite");// 12
	}

}
