package JavaPackage;

public class MethodOveroad1 {
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOveroad1 m1=new MethodOveroad1();
		m1.sum(15, 25);
		m1.sum(15, 25,35);

	}

}
