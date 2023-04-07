
public class VariableTypesMethodTypes {
	// Variable -> state of an object
	
			// Types of Variable:
			    // 1.Class variable: defined outside any method but inside the class, static keyword
			    // 2.Instance variable: defined outside any method but inside the class
			    // 3.Local variable: -> variable created inside a method
			    
			    // Parameter:  ??
	static int x = 10; // Class variable/Static variable 
	int y = 20; // Instance variable/Non Static variable
	
	

	public static void addtion() {
		int a = 50;
		int b = 25;
		System.out.println(a+b);
	}
	
	public void substraction() {
		System.out.println(y);
		System.out.println(x);
		 
		
	}
	
	
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println(a+b);
		addtion();
		
		VariableTypesMethodTypes vtm = new VariableTypesMethodTypes();
		
		
		System.out.println(x); // Driect Calling
		System.out.println(VariableTypesMethodTypes.x); // By ClassName
		System.out.println(vtm.x);
		
		// Calling Instance Variable/Non-static variable
		System.out.println(vtm.y);
		
		
		
		
		
	}

}
