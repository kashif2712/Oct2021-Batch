
public class SamePackageClass {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		// public access:
		amc.a = "From different class of same package";
		System.out.println(amc.upperCasingString());
	}

}
