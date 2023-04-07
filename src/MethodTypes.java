import java.util.Scanner;

public class MethodTypes {
	
	// Method -> behavior of an object
	// Parameter-> variable defined inside the method signature
	// Method Types

	public static void addition() {
		int a = 10;
		int b= 20;
		System.out.println(a+b);
	}
		
		// Method with single parameter:
	public static void substraction(int a) {
		System.out.println("Your provided value: "+a);
	}
	
	public static void multiplication(int a,double b) {
		System.out.println(a*b);
	}
	
	// Method Overloading: (Vs Method overriding???)
	// Multiple method with same name but with different number or types of parameter
	
	
	public static void addition(int a , int b) {
		System.out.println(a+b);
	}
	public void addition (double a, double b) {
		System.out.println(a+b); 
		
	}
	public void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
//	void test() {
//		
//	}
//	void test() {
//		
//	}
	 //Constructor method
	MethodTypes(){
		System.out.println("I am in constructor");
	}
	
	// Constructor Overloading:
	MethodTypes(String a){
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		addition();
		MethodTypes mt = new MethodTypes();
		mt.addition(100,200);
		mt.addition(10.77, .143163245);
		mt.addition(10, 1443, 324131);
		substraction(100);
		multiplication(10,20.55d);
		multiplication(100,4.55656d);
		
		MethodTypes mt1 = new MethodTypes("Understanding Constructor");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name in format (FirstName LastName): ");
		String custName = scan.next();
		ReturnType rt = new ReturnType(custName);
		System.out.println(rt.nameIntial());
	}

}
