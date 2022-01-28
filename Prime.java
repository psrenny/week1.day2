package week1.day2;

public class Prime {

	public void checkPrime(int n)
	{
		int num = n;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.checkPrime(15);
	}

}


