package week3.day2;
//import java.util.Arrays;
public class OddindexTouppercase {
		public static void main(String[] args) {
			// declare a String
			String name="testleaf";
			// convert String to char array
			char[]odd=name.toCharArray();
			// Iterate the loop to store the value in I
			for(int i=0;i<name.length();i++)
			{
				//set a condition i is not equal to 0
				if(i%2!=0)
				{	 
					//use odd keyword to print odd letter in capital
					odd[i]=Character.toUpperCase(odd[i]);	
					
				}			
			}
			//print the result
			System.out.println(odd);
		}

	}


