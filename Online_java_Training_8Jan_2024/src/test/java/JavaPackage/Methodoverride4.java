package JavaPackage;

public class Methodoverride4 extends Methodoverride3{
	public void run()
	{
		System.out.println("you are running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverride4 m4=new Methodoverride4();
		m4.run();
		Methodoverride3 m3=new Methodoverride3();
		m3.run();

	}

}
