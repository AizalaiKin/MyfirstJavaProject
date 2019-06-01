package team14;


import java.util.Scanner;


public class team14task2 {
	public static void main(String[] args) {
		
		int width;
		int length;
		  
		Scanner intel = new Scanner(System.in);
		 
		System.out.println("Please enter width:");
		width = intel.nextInt();
		
		System.out.println("Please enter length:");
	    length = intel.nextInt();
	    
	    int area = width * length;
	    int perimetr = 2*(width + length);
	    
		System.out.println("Area of rectangle: " + width*length);
	}
 
}
