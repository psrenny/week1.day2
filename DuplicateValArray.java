package week1.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class DuplicateValArray {

	public static void main(String[] args) {
		int [] arr = new int [] {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};   
		System.out.println("Duplicate values in this array are: ");
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                {
                    System.out.println(arr[j]);
                }
            }  
        }  

	}

}
