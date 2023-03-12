package week2.day5;

import java.util.Arrays;

public class Missing {
	public static void main(String[] args) {
		//declare  array  
		int num[]=  {1,2,3,4,7,6,8};		
		//sort the array
		Arrays.sort(num);
		//Iterate the loop
	for (int i = 0; i < num.length; i++) {
		//to set is condition to find the Missing element
			 if (num[i]!=i+1) {
				// print the result
				 System.out.println(i+1);
				// to stop the loop
				 break;
			 }	
			}
		
		
	}

}
	  
