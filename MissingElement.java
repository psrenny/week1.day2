package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		int j=0;
		for(int i=1; i<=a.length; i++)
		{
			if(a[j]!=i)
			{
				System.out.println(i);
				j--;
			}
			j++;

		}

	}

}
