
public class ReturnType {

	String custName;
	
	ReturnType(String custName){
		this.custName=custName;
		
	}
	String nameIntial() { // David Millet -> DM
		int spaceIndex = custName.indexOf(" ");
		char firstNameInt = custName.charAt(0);
		String firstNameIntString = Character.toString(firstNameInt);
		char lastNameInt =custName.charAt(spaceIndex+1);
		String lastNameIntString = Character.toString(lastNameInt);
		String nameInt =firstNameIntString.concat(lastNameIntString);
//		System.out.println("Customer initial: "+nameInt);
		return nameInt;
		
		
	}
	
	}
		

	

}
