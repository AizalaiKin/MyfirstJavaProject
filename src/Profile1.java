


import java.util.Scanner;

public class Profile1 {

public static void main (String[]args){

	System.out.println ("Welcome to my program !"); 
    String firstName;
    String lastName;
    int age;
    String location;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first name");
    firstName = input.next();
    System.out.println("Please enter your  last name");
    lastName =input.next();
    System.out.println("Your location? ");
    location=input.next();
    System.out.println("And your age? ");
    age= input.nextInt();
    input.close();
  
    System.out.println ("Welcome to my program "+firstName +" " + lastName+"!"); 
    
    System.out.println("Your name length is: " + (firstName.length() + lastName.length()));
    
    System.out.println(location.indexOf("a"));
    
    
   }
}   
	
