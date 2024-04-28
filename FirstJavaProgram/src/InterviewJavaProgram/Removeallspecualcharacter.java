package InterviewJavaProgram;

public class Removeallspecualcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@@##$$%%&&52736hsgahdg????";
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);

	}

}
