// Java program implementing Singleton class 
// with getInstance() method 
class Singlton {
	// static variable single_instance of type Singleton
	private static Singlton single_instance = null;

	// variable of type String
	public String s;

	// private constructor restricted to this class itself
	private Singlton() {
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class
	public static Singlton getInstance() {
		if (single_instance == null)
			single_instance = new Singlton();

		return single_instance;
	}
}

// Driver Class 
public class Main {
	public static void main(String args[]) {
		// instantiating Singleton class with variable x
		Singlton x = Singlton.getInstance();
		// instantiating Singleton class with variable y
		Singlton y = Singlton.getInstance();

		// instantiating Singleton class with variable z
		Singlton z = Singlton.getInstance();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// changing variable of instance x
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}
