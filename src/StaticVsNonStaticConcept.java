
public class StaticVsNonStaticConcept {
	// class properties can e static or non-static
	// static property will have static keyword
	// non-static property will not have static keyword, connected with instance/object of the class

	public static void addition() { // static method
		int a = 10;
		int b= 20;
		System.out.println(a+b);
	
	}
	
	public void substraction() {  // non-static method
		int a = 10;
		int b = 20;
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		StaticVsNonStaticConcept svn = new StaticVsNonStaticConcept();
		svn.addition();		
		// calling static property:
		addition(); // direct calling
		StaticVsNonStaticConcept.addition(); // Calling with ClassName
		svn.addition();
		
		
		
		// Calling non-static property
		// subtraction(); // direct calling not allowed from static method
		// staticVsNonstaticConcept.substraction();
		svn.substraction();
		
		
;		

	}

}
