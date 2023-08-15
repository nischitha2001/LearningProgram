import java.util.Scanner;

public class tempreture {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Welcome to the Temperature Conversion Tool!");
    System.out.println("Slect an Option "
    		+ "\r\n"
    		+ "1. Convert Celsius to Fahrenheit\r\n"
    		+ "\r\n"
    		+ "2. Convert Fahrenheit to Celsius");
    System.out.println("Enter your choice:");
    int Choice = scan.nextInt();
	
	
	
    if (Choice==1)
   		 {
    	System.out.println("Enter the temperature in celsius:");
    	double celsius=scan.nextDouble();
    	double res1= CtoF(celsius);
		System.out.println(res1);

   		 }
	if (Choice==2)
		   {
		System.out.println("Enter the temperature in fahrenheit:");
		double fahrenheit=scan.nextDouble();
		double res2= FahrenheittoCelsius(fahrenheit);
		System.out.println(res2);
    }
	}
     public static double CtoF(double celsius)
     {
	  return celsius*(9/5)+32;
     }
     public static double FahrenheittoCelsius(double fahrenheit)
     {return (fahrenheit-32)*9/5;
     }
}

