package InterviewJavaProgram;

public class MaximumNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,34,56,77};
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			
				max=a[i];
				
		else if(a[i]<min)
		
			min=a[i];
		
		
	}
		
		System.out.println("The maximum number is "+ max);
		System.out.println("The maximum number is "+ min);

}
}
