package JavaPackage;


public class Variable8 {
	
	int b=10;
    static int c=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=15;
		
		System.out.println(a);
		System.out.println(c);
		Variable8.a();
		a();
		
		Variable8 v1=new Variable8();
		v1.b();
		System.out.println(v1.b);
		
}
	
	public static void a()
	{
		int p=25;
		System.out.println(p);
		
	}
	public  void b()
	{
		int q=20;
		System.out.println(q);
	}

}
