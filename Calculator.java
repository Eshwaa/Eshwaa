package week2.day1;

public class Calculator {
	public String addTwonumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return null;
	}
	public void subTwonumber(int e,int f)
	{
		int d=e-f;
		System.out.println(d);
	}
	public void multiTwonumber(int i,int j)
	{
		double g=i*j;
		System.out.println(g);
	}
	public void diviTwonumber(int i,int j)
	{
		float g=i/j;
		System.out.println(g);
	}
		 public static void main(String[] args) {
		 Calculator calc=new Calculator();
		 calc.addTwonumber(10,20);
		 calc.subTwonumber(10,10);
		 calc.multiTwonumber(10,50);
		 calc.diviTwonumber(100,50);
		 }
		
}
