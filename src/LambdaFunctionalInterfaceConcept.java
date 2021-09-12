
public class LambdaFunctionalInterfaceConcept {

	public static void main(String[] args) {
		interf i = () -> System.out.println("lambda implementation!!!");
		i.m1();
		i.m2();
		interf.m3();

	}

}

@FunctionalInterface
interface interf {
	void m1();

	default void m2() {
		System.out.println("Default method called!!!!");
	};

	static void m3() {
		System.out.println("Static method called!!!");
	};
}
