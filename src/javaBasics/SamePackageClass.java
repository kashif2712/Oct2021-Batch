package javaBasics;

public class SamePackageClass {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		// public access:
		amc.a = "From different class of same package";
		System.out.println(amc.upperCasingString());
		//private access: - not visible
					amc.c = 100;
					amc.addition(5);
					// protected access
					amc.d ='D';
					amc.printCharcter();
//					amc.e ="trying to change";
					System.out.println(amc.e);

	}

}
