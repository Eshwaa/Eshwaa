package week2.day5;
import java.util.Scanner;
public class Getinput {
	
		public static void main(String[] args) {
			//for(int i=5; i>=0;i--)
			//create a new object for scanner 
			Scanner scan=new Scanner(System.in);
			//to print in the console
			System.out.println("enter the name :");
			//to get the input String
			String nextLine=scan.nextLine();
			//to convert String into char
			char[] character=nextLine.toCharArray();
			//Iterate the loop to start from the last index
			for(int i=character.length-1;i>=0;i--){
				//print the result
				System.out.println(character[i]);
			}
		}

	}


