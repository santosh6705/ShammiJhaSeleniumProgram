package JavaPackage;

public class Constrictor3 {
	//Constructor Overoading
	
	Constrictor3()
	{
		System.out.println("I am in Constructor overloading");
	}
	
	Constrictor3(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrictor3 con=new Constrictor3();
		Constrictor3 con2=new Constrictor3(12,34);
	
		
		
	}
}
