package week2.day2;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="I am Manual Tester";
			String[] arr=str.split(" ");
			for(int i=1;i<arr.length;i+=2)
			{
					StringBuilder sc=new StringBuilder(arr[i]);
					arr[i]=sc.reverse().toString();	
			}
			String reversedString=String.join(" ", arr);
					
			System.out.println(reversedString);
		}

	
}
