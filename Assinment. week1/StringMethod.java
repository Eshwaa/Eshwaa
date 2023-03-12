package week3.day2;

public class StringMethod {

	public static void main(String[] args) {
		 
					String email="ehwaa123456@gmail.com";
					//it print only numeric
					String replaceAll = email.replaceAll("[^0-9]", "");
					
					
					//it print only numeric
					//String replaceAll = email.replaceAll("\\D", "");
					
					
					//it print alphabet and special character
					//String replaceAll = email.replaceAll("\\d", "");
					
					
					//only print the alphabet
					//String replaceAll = email.replaceAll("[^A-z a-z]", "");
					System.out.println(replaceAll);

	}

}
