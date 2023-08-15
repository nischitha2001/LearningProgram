
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("entre the 2 number:");
     long num1=scan.nextLong();
     long num2=scan.nextLong();
     System.out.println(galacticAddition( num1 , num2));
     
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
