import java.util.Scanner;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fulll name:");
		String customerName = scan.nextLine();
		scan.close();

		// reverse String
		
		char lastCharacter = customerName.charAt(customerName.length()-1);
		System.out.println(lastCharacter);
		
		for(int i=customerName.length()-1; i>=0; i--) {
			char stringChar = customerName.charAt(i);
			System.out.println(stringChar);
		}
		 System.out.println();
		
		StringBuffer sb = new StringBuffer(customerName);
		System.out.println(sb.reverse());
		
		StringBuilder sbu =new StringBuilder(customerName);
		System.out.println(sbu.reverse());		
		
	
	}

}
