package InterviewJavaProgram;

public class PallindrumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121,rem=0,revnum=0,temp=num;
		while(num>0) {
		  rem=num%10;
		  revnum=revnum*10+rem;
		  num=num/10;
		  
		 }
		if(temp==revnum)
		
		System.out.println("THe given number is a pallindrum");
		
		else
			
			System.out.println("THe given number is not a pallindrum");	
	}

}
