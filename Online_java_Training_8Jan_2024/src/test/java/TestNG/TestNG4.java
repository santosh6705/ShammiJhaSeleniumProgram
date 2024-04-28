package TestNG;

import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	public void a()
	{
		System.out.println("Hello a method");	
	}
	@Test(invocationCount=0)
	public void b()
	{
		System.out.println("Hello b method");	
	}
	@Test(enabled=false)
	public void c()
	{
		System.out.println("Hello c method");	
	}

}
