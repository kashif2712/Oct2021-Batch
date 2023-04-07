package javaBasics;

public class AccessModifierConcept {

	
		// Access Modifier -> properties (variable & methods)
		
		// Types of Access Modifier
		   // 1. public -> available from anywhere from different class of same package or different package
		   // 2. private -> only available within class
		   // 3. default -> available within class, from class of same package but not from different package | not available from sub-class (child class) from different package
		   // 4. protected -> available within class, from class of same package but not from different package | available from sub-class (child- class ) from different package
		//final -> to restrict access to change data assigned 
	    // Access Modifier from class:
	    // 1.public: able to create instance/object from same package or different package
	    // 2. final: able to create instance/object from same package
	    // 3. abstract: ???- will be covered in OOPS concept
		public String a;
		private String b;
		int c;
        protected char d;
        
        final public String e= "Do not manipulate";
		
		public String upperCasingString() {
		  return a.toUpperCase();
			
		}
		
		private String lowerCasingString() {
			return b.toLowerCase();
			
			
		}
		
		void addition(int a) {
			System.out.println(a+c);
		}
		
		
		protected void printCharcter() {
			System.out.println(d);
		}
		
		
		public static void  main(String[]args) {
			AccessModifierConcept amc = new AccessModifierConcept();
			
			 //public access:
			amc.a = "Learning access modifier concept";
			System.out.println(amc.upperCasingString());
			// private access:
			amc.b = amc.a;
			System.out.println(amc.lowerCasingString());
			// default access:
			amc.c = 100;
			amc.addition(5);
			// protected access
			amc.d ='D';
			amc.printCharcter();
			//
//			amc.e ="trying to change";
			System.out.println(amc.e);
	}

}
