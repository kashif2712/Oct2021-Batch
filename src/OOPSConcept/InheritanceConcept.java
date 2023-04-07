package OOPSConcept;

import test.UnderstandingProtectedVsDefault;

public class InheritanceConcept extends UnderstandingProtectedVsDefault {
	
	// Inheritance -> relation between classes (child-parent) so property can be inherited
	      //-> extends keyword in child class
	//child class-> sub-class
	//parent class->Super class
	// Types of inheritance:
	    //1. Single Inheritance:child class-< Parent class
	    //2. Multi-Layer Inheritance:grand child class-< parent class-<Grand parent class
        //3. Herarichal Inheritance:child-1 <- Parent->child-2
	    //4. Multiple Inheritance: child class can't have multiple parent class between classes is not available
	
	public static void main(String[] args) {
		InheritanceConcept ic = new InheritanceConcept();
//		ic.defaultMethod();
		// protected access:
		ic.protectedMethod();
		

	}

}
