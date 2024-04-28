package InterviewJavaProgram;

public class SumofDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=23457,rem=0,sum=0;
		while(num>0) {
			 rem=num%10;
			 
		 sum=sum+rem;
		 
		 num=num/10;//2345,
		 
		  
		 }
		
		System.out.println("The number of digits in number is"+sum);

	}

}
