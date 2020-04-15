package pkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1
{
	@Test
	protected void tc1()
	{
		System.out.println("I am Class1 1st test");
	}
	
	@Test(priority=0)
	protected void tc2()
	{
		System.out.println("I am Class1 2nd test");
	}
	
	
	
}
