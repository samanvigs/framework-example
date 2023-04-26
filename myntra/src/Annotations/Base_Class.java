package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Class
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("before  test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println(" after method");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println(" after class");
	}

	@AfterTest
	public void at()
	{
		System.out.println(" after test");
	}

	@AfterSuite
	public void as()
	{
		System.out.println(" after suite");
	}
}
