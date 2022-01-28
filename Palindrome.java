package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String Pal = "Malayalam";
		char[] Rev= new char[Pal.length()];
		Pal.toCharArray();
		int j = Pal.length()-1;
		for(int i=0; i<Pal.length(); i++)
		{
			Rev[j]=Pal.charAt(i);
			j--;
		}
		
		String Reverse=String.valueOf(Rev);
		
		if(Reverse.equalsIgnoreCase(Pal))
		{
			System.out.println("String "+Reverse+" is a Palindrome");
		}
		else
		{
			System.out.println("String "+Reverse+" is not a Palindrome");
		}

	}

}
