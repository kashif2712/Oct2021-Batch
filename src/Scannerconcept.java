import java.util.Scanner;

public class Scannerconcept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String usernameDB ="test12";
		String passwordDB = "123";		
		System.out.println("Enter username");
		String username=scan.nextLine();
		System.out.println("Enter password:");
		String password = scan.nextLine();
		
		scan.close();
		
		if(username.isBlank()||password.isBlank()); {
			System.err.println("Required value");
		}
	   
	else {
    if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
			System.out.println("Login succesful!");
			}
		else {
			System.err.println("login Denied!");
		}
			
		}

	}

}
