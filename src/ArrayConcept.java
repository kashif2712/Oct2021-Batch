import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
	String[] customerName = {"Tom","David","Michael","jerry","Mary","Tommy","Jessica"};
	
	System.out.println("number of rows: "+customerName.length);
	
	for (int i=0;i<customerName.length; i++) {
		System.out.println(customerName[i]);
		
	 String[][] customerLoginCredentials = new String[3][2];
	 //1st row
	 customerLoginCredentials[0][0]= "tom1";
	 customerLoginCredentials[0][1]= "t@123";
	 // 2nd row
	 customerLoginCredentials[0][0] ="david1";
	 customerLoginCredentials[0][1]= "d@123";
	 // 3rd row
	 customerLoginCredentials[2][0]= "jessica1";
	 customerLoginCredentials[2][1] = "j@123";
	 System.out.println("David's username: "+customerLoginCredentials[1][0]);
	 
		    
	    }
	         
	    
	    
	
	
	
	
	    
	    
	    
		
	
		
		
		
		
	 
	}

}
