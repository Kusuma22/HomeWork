package learningTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void yes()
	{
		System.out.println("checking beforemothod");
	}
	
	@BeforeTest
	public void openbrowser()
	{
		System.out.println("Open browser - IE or firefox or chrome");
	}
	
	@Test
	public void Gotoexpedia()
	{
		System.out.println("Opening expedia website");
	}
	
	@Test
	public void checkflights()
	{
		System.out.println("Check the dates available, flights & ticket cost");
	}
	
	@Test
	public void flightbooking()
	{
		System.out.println("Book the flight");
		
	}
	
	
	

}
