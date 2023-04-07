
public class AccessModifierConcept {
	// Access Modifier -> properties (variable & methods)
	
	// Types of Access Modifier
	   // 1. public -> available from anywhere from different class of same package or different package
	   // 2. private -> only available within class
	   // 3. default -> available within class, from class of same package but not from different package | not available from sub-class (child class) from different package
	   // 4. protected -> available within class, from class of same package but not from different package | available from sub-class (child- class ) from different package
	
	public String a;
	
	public String upperCasingString() {
	  return a.toUpperCase();
		
	}
	
	public static void  main(String[]args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		
		 //public access:
		amc.a = "Learning access modifier concept";
		System.out.println(amc.upperCasingString());
		System.out.println(amc.upperCasingString());
		
		
		
	}

}
