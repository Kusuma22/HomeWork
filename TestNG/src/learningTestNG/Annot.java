package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("testing before test annotation");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("testing before method");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("testing aftermethod");
	}
	
	@Test
	public void test1()
	{
		System.out.println("testing 1");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("testing 2");
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("testing 3");
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("testing 4");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("testing after test annotation");
	}
	
	

}
