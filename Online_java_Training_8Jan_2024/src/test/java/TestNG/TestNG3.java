package TestNG;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test
	public void a()
	{
		System.out.println("Hello a test method");
	}
	@Test(priority=-10)
	public void b()
	{
		System.out.println("Hello b test method");
	}
	@Test(priority=0)
	public void c()
	{
		System.out.println("Hello c test method");
	}
	@Test(priority=1)
	public void d()
	{
		System.out.println("Hello d test method");
	}
}
