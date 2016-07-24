package learningTestNG;


import org.testng.annotations.BeforeSuite;


public class SuiteAnnot {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am the first to be executed");
	}
	

}
