package week3.day2;

public class FindIntersection {
	public static void main(String[] args)
	{
		//declare two array
		int[] num1= {1,2,3,4,5,6,7,8};
		int[] num2= {11,12,13,14,15,2,5,7,4};
		//nested loop
		//this loop for a[]
		for (int i = 0; i < num1.length; i++) {
			//this loop for b[]
			for (int j = 0; j < num2.length; j++) {
				//set a condition a and  is equal
				if(num1[i]==num2[j]) {
					//print the result
					System.out.println(num1[i]);
				}
			}
		}
	}
	}