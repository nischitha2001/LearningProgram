import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed and Time to Caluculate Distence");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
    JourneyCalculator journeyCalculator = new JourneyCalculator();
	double distence=journeyCalculator.calculateDistance(speed,time);
	System.out.println(distence);
	}
	
		

	

}
