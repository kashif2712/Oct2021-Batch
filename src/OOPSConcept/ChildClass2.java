package OOPSConcept;

public class ChildClass2 extends ParentClass {

	public static void main(String[] args) {
		parentmethod2();
		ChildClass2.parentmethod2();
		ChildClass2 cc = new ChildClass2();
		cc.parentmethod1();
		// grandparent property
		grandparentmethod2();
		ChildClass2.grandparentmethod2();
		cc.grandparentmethod1();

		
	}

}

