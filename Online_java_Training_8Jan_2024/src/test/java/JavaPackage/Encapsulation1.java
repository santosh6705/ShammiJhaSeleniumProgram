package JavaPackage;

public class Encapsulation1 {
	
	String name;//Global variable
	int b;//Global variable
	final int c=2;//Final variable
	
	public void a()
	{
		//c=5;//C is a fina variable
	}
	final void b()
	{
   System.out.println("Final method");
	}
	public void setName(String s)
	{
		this.name=s;
		this.b=10;
		System.out.println(b);
		System.out.println(c);
		System.out.println("I am in setter method");
		
	}
	public void getName(String s)
	{
		System.out.println("I am in getter method");
	}

	
}
