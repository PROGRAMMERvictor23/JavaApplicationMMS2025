 import java.util.Scanner;

public class UserInput{
	 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);	  
		
		System.out.print("please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your address: ");
		String address = scan.nextLine();
		   
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.print("Enter your gender(Male/Female: ");
		char gender = scan.next().charAt(0);
		
		System.out.printf("Are you happy to learn java?(true/false: ");
		boolean ishappy = scan.nextBoolean();
	    
		
		System.out.println("");
		System.out.println("");
		
		 
		System.out.printf("Hello %s ,How are you today?%n",fullName);
		System.out.printf("Nice meeting you, you are living in %s%n", address);
		System.out.printf("%s, you are %d years old",fullName,age);
		System.out.printf("you are a %s%n " ,gender);
		System.out.printf("Are you happy to learn java? %b%n ",ishappy);
	 }
}