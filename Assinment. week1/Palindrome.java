package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		//declare the variable str=vasanth
	        String str = "vasanth";
	        //declare the another variable rev with empty value
	       String rev = "";
	      //Iterate the for loop in decrement
	        for (int i = str.length() - 1; i >=0; i--) {
	        	 //
	            rev = rev + str.charAt(i);
	        }
	       // set a condition str and rev is equal
	        if (str.equals(rev))
	            System.out.println(str + " is palindrome");
	        else
	            System.out.println(str + " is not palindrome");
	    }

	}




