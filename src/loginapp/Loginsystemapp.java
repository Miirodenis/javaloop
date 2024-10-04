package loginapp;
import java.util.Scanner;
public class Loginsystemapp {

	public static void main(String[] args) {
		// predefined username and password
String predefinedUsername ="MIIRO DENIS";
	String predefinedPassword ="casemiro";
	int attempts = 3;
			Scanner scanner =new Scanner(System.in);
				do { 
									System.out.println("Enter username:");
	String enteredUsername =scanner.nextLine();
	System.out.println("Enterbpassword:");
	String enteredPassword =scanner.nextLine();
	attempts++;
						
	if(enteredUsername.equals (predefinedUsername)  &&  enteredPassword.equals(predefinedPassword))
	
	
	{  System.out.println("login successful WELCOM TO MUBS");
	break;
	}else {System.out.println("Invalid username or password. Attempts:" +attempts);
	
	 		
	}
				} while(attempts<3);	
				
			if(attempts==3) {System.out.println("Maximum attempts reached. Exiting.");
	
	
			}	
				
		}
	
	}  
	

