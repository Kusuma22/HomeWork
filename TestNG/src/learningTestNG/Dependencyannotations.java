package learningTestNG;

import org.testng.annotations.Test;

public class Dependencyannotations {

	

	@Test(dependsOnMethods={"test1"}, alwaysRun=true)
	public void test2()
	{
		System.out.println("testing 2");
	}
	

	@Test
	public void test1()
	{
		System.out.println("testing 1");
		
	}
	

	@Test(timeOut=5000)
	public void time()
	{
		System.out.println("execute the task within 5 sec");
		
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("testing 3");
	}
	
}
