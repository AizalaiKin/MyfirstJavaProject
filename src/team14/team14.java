package team14;

import java.util.Scanner;

 public class team14 {
	public static void main(String[] args) {
		
	int inputInt;
	double inputDouble;
	String inputStr;
	
	Scanner inputFromUser = new Scanner(System.in);
	
	System.out.println("Please enter integer: ");
	inputInt = inputFromUser.nextInt();
	
	System.out.println("Please enter double: ");
	inputDouble = inputFromUser.nextDouble();
	
	System.out.println("Please enter string: ");
	inputStr = inputFromUser.next();
	
	System.out.println("String: " + inputStr);
	System.out.println("Double: " + inputDouble);
	System.out.println("Int: " + inputInt);
	 
	
	}
}
