package week2.day5;

public class Star {

	public static void main(String[] args) {
			// Nested for loop
		//this loop is used to print row
				for (int i = 1; i <=5; i++) {
		//this loop is used to print column
				for (int j = 1; j <=i; j++) {
					//print the result
					System.out.print("* ");
				}
			//	print in new line 
				System.out.println();
				}
	}
}
