import java.util.Scanner;

public class TotalWithTax {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the purchase amount:");
      double amount=scan.nextDouble();
      System.out.println("Enter the tax rate (in decimal form):");
      double tax=scan.nextDouble();
      double res=calculateTotalWithTax(amount,tax);
      System.out.println("Total cost including tax:"+res);
	}
    public static double calculateTotalWithTax(double amount, double tax)
    {
    	return amount+(amount*tax);
    }
}
