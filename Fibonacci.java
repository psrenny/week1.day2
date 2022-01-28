package week1.day2;

public class Fibonacci {

	public void Fibo(int range)
	{
		System.out.println("Fibonacci serires upto the range "+range+" is as follows:");
		int j=0;
		int k=1;
		System.out.println(j);
		System.out.println(k);
		for(int i=0; i<range; i++)
		{
			int l=j+k;
			System.out.println(l);
			j=k;
			k=l;
		}

	}
	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		obj.Fibo(10);
		
	}

}
