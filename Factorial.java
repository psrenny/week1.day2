package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int j=1;
		for (int i=1; i<=5;i++)
		{
			int k = i*j;
			j=k;
			
		}
		System.out.println(j);
	}

}
