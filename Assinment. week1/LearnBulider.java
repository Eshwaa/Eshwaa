package week3.day3;

public class LearnBulider {

	public static void main(String[] args) {
		 // create a new object 
				StringBuffer buffer=new StringBuffer("Test");
				//join one String to another String
				buffer.append("leaf");
				// print the result
				System.out.println(buffer);
				
				StringBuffer insert = buffer.insert(0, "a ");
				// print the result
				System.out.println("insert "+insert);
				
				StringBuffer reverse = buffer.reverse();
				// print the result
				System.out.println(reverse);
				
				StringBuffer delete = buffer.delete(1, 4);
				// print the result
				System.out.println(delete);
				
		
			}

		

	}


