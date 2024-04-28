package JavaPackage;

public class EH6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{ 
			int i=20/0;
		
		}finally {
			System.out.println("I am in finally block");
			
			try {
				int a=5/0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exception Handling");
	}
	
}
