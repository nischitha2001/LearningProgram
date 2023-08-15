import java.util.Scanner;

public class swapper {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter first integer:");
     int a=scan.nextInt();
     System.out.println("Enter second integer:");
     int b=scan.nextInt();
     swapUsingBitwise( a, b);
     
	}
	public static void swapUsingBitwise(int a, int b)
	{
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("After Swapping:" + "First:" +a + "second:"+b);
	}

}
