package week3.day2;
//import java.util.Arrays;
public class OddindexTouppercase {
		public static void main(String[] args) {
			 
			String str="testleaf";
			 
			char[]ch=str.toCharArray();
			 
			for(int i=0;i<str.length();i++)
			{
				if(i%2!=0)
				{	 
					ch[i]=Character.toUpperCase(ch[i]);	
				}		
				
			}
			 
			System.out.println(ch);	

		}

	}


