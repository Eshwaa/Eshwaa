package week2.day5;
import java.util.Arrays;
public class Small {
public static void main(String[] args) {	
	//declare the array
int num[]= {1,5,9,2,6,3,5,4,8,7};
//sort the array
Arrays.sort(num);
//Iterate the loop for ascending order
for (int i = 0; i < num.length; i++) {
	//print the result
System.out.println(num[i]);
}
//print the second largest value using arithmetic operators
System.out.println("second larest numer ="+num[num.length-2]);
}
}