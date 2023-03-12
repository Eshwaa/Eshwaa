package week3.day2;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a String variable
			String str="I am Manual Tester";
			//separate str variable using split method to store as a array
			String[] arr=str.split(" ");
			//Iterate the loop to access the even array
			for(int i=1;i<arr.length;i+=2)
			{
				//reverse the even String 
					StringBuilder sc=new StringBuilder(arr[i]);
					//store the String array
					arr[i]=sc.reverse().toString();	
			}
			String reversedString=String.join(" ", arr);
			//print the result		
			System.out.println(reversedString);
		}

	
}
