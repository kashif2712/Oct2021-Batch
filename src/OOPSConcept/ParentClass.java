package OOPSConcept;

public class ParentClass extends GrandParentClass {
	
	public void parentmethod1() {
		System.out.println("Parent method- 1");
	}
    
	public static void parentmethod2() {
		System.out.println("Parent method- 2");
	}
	public  void sameMethod() {
		super.sameMethod();
		System.out.println("Mehod Overriding- Parent");
		
	public static void main(String[] args) {
		grandParentMethod2();
		ParentClass.grandParentMethod2();
		ParentClass pc =new ParentClass();
		pc.grandParentmethod1();
		
		
		
	}
		

	}

}
