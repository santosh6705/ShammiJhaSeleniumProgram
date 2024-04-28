package JavaPackage;

public class MethodOveride2 extends  MethodOveride1{
	
	public void eat()
	{
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOveride1 m1=new MethodOveride1();
				m1.eat();
				
				MethodOveride2 m2=new MethodOveride2();
				m2.eat();

	}

}
