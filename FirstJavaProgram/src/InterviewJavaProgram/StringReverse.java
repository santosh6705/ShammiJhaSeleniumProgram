package InterviewJavaProgram;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MADAM",revstring="";
		String temp=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			revstring=revstring+str.charAt(i);
			
			
		}
		System.out.println(revstring);
		
		if(temp.equals(revstring))
		{
		
			System.out.println("The given string is pallindum");
		}
		else
		{
			System.out.println("The given string is not pallindum");
		}
			

	}

}
