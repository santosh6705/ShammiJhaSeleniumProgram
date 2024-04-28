package JavaPackage;

public class Inheritance4 extends Inheritance3{
	
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("The sum of the number is"+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100,y=200;
		Inheritance4 i4=new Inheritance4();
		i4.add(x, y);
		i4.diff(x, y);
		i4.multiplication(x, y);

	}

	
	

}
