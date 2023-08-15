import java.util.Scanner;
public class calculator1 {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int a=scan.nextInt();
      double x=(double) a;
      float c= (float)a;
      System.out.println("Enter the second number:");
      int b= scan.nextInt();
      double y=(double) b;
      float d= (float)b;
      System.out.println("Enter the operator (+, -, *, /):");
      char operator = scan.next().charAt(0);
      calculate(a,b, operator);
      calculate(x,y, operator);
      calculate(c,d, operator);
      
      
      
	}
	public static int calculate(int a, int b,char operator)
	{
		 switch(operator)
	      {
	      case '+':
	    	int result = 0;
	    	System.out.println("num1" + "+" + "num2" + "=" + result);
	    	break;
	      }
		
		return a+b;
	}
	public static double calculate(double x, double y,char operator)
	{
		double result1=0;
		switch(operator) {
	      case '-':
    	  System.out.println("num1" + "-" + "num2" + "=" + result1);
    	  break;
	      
		}
		return x-y;
	}
	public static float calculate(float c, float d,char operator)
	{
		float result2=0;
		switch(operator) {
		case '*':
	     System.out.println("num1" + "*" + "num2" + "=" + result2);
	     break;
		
		}
		result2=c*d;
		return result2;
	}
	public static long calculate(long n, long m,char operator)
	{
		long result3=0;
		switch(operator) {
		case '/':
	      	  System.out.println("num1" + "/" + "num2" + "=" + result3);
	      	  break;
	      
		}
		return n/m;
	}
}
