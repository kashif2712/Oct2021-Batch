package OOPSConcept;

public class ChildClass extends ParentClass{
	
	void childMethod() {
		System.out.println("Child Method");
	}
	public  void sameMethod() {
		super.same Method();
		System.out.println("Method Overriding- Child ");

	public static void main (String[] args) {
		parentmethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass();
		cc.parentmethod1();
		// grandparent property
		grandparentmethod2();
		ChildClass.grandparentmethod2();
		cc.grandparentmethod1();
		
		// polymorphism
		ParentClass pc = new ChildClass();
		cc.childMethod();
		pc.parentmethod1();
	    pc.grandparentmethod1();
	    
	    GrandParentClass gpc = new ChildClass();
	    
	    cc.sameMethod();
	    pc.sameMethod();
	    gpc.sameMethod();
	    
	    
	    
	    
	  
	  
	  
	}
	
	
		
		
		
		  
		
		

	}

}
