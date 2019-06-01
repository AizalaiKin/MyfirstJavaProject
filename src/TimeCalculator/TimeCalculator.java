package TimeCalculator;

import java.util.Scanner;

public class TimeCalculator {
	public static void main (String [] args) {
		
	Scanner input = new Scanner (System.in);
				 
	System.out.println("\tWelcome to time Calculator!\n");
	System.out.println("Please enter min:");
	int min =input.nextInt();
	int hour = min/60;
	int reminingMin = min % 60;
						
	System.out.println(min+"min converted into:");
	System.out.println(hour + "hour");
	System.out.println(reminingMin + "min");
				
		
	}

}
