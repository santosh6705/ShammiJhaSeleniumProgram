package JavaPackage;

public class Abstraction2 extends Abstraction1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction1 ab=new Abstraction2();	
		ab.abstraction();
		ab.eat();
		

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("You are in abstraction class");
		
	}

}
