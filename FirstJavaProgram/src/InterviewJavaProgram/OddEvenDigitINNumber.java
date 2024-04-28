package InterviewJavaProgram;

public class OddEvenDigitINNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=23457,rem=0,oddcount=0,evencount=0;
		while(num>0) {
			 
			 num=num/10;
			 if(num%2==0)
				 
				 evencount++;
			 else
				 oddcount++; 
				 
		 
		  }
		
		System.out.println("The number of even digits in number is"+evencount);
		System.out.println("The number of odd digits in number is"+oddcount);

	}

}
