package InterviewJavaProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=23457,rem=0,revnum=0;
		while(num>0) {
		  rem=num%10;
		  revnum=revnum*10+rem;
		  num=num/10;
		  
		  
		
		}
		System.out.println(revnum);
	}

}
