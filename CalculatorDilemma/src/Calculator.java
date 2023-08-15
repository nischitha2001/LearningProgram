import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	  int result;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enetr a operator for calculation:");
      char operator = scan.next().charAt(0);
      System.out.println("enter any number1:");
      int num1 = scan.nextInt();
      System.out.println("enter any number1:");
      int num2 = scan.nextInt();
      switch(operator)
      {
      case '+':
    	result=num1+num2;
    	System.out.println("num1" + "+" + "num2" + "=" + result);
    	break;
      case '-':
    	  result=num1-num2;
      	  System.out.println("num1" + "-" + "num2" + "=" + result);
      	  break;
      case '*':
    	  result=num1*num2;
      	  System.out.println("num1" + "*" + "num2" + "=" + result);
      	  break;
      case '/':
    	  result=num1/num2;
      	  System.out.println("num1" + "/" + "num2" + "=" + result);
      	  break;
      default:
    	  System.out.println("Invalid operator");
    	  break;
      		  
    	  
      }
	}

}
