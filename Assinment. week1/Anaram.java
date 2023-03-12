package week3.day3;

import java.util.Arrays;

public class Anaram {

	public static void main(String[] args) {
		 String str1 = "god"; 
		 String str2 = "dog";
		 
		 //To check both string length are equal
		 int length1 = str1.length();
		 int length2 = str2.length();
		 if(length1==length2) {
			 System.out.println("Length are equal");
		 }else {
			 System.out.println("not equal");
		 }
		 //convert the str1 to character
		 char[] charArray = str1.toCharArray();
		 //convert the str2 to character
		 char[] charArray2 = str2.toCharArray();
		 //sort the character in Ascending order
		 Arrays.sort(charArray);
		 Arrays.sort(charArray2);
		 //print the result in array
		 System.out.println(Arrays.toString(charArray));
		 System.out.println(Arrays.toString(charArray2)); 
		 if(Arrays.equals(charArray, charArray2)) {
			 System.out.println("The given String is Anagram");
		 }else {
			 System.out.println("not Anagram");
		 }
		 
		 
	}
	}

