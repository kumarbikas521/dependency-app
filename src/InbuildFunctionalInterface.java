import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuildFunctionalInterface {

	public static void main(String[] args) {
		Consumer<Integer> c = (a) -> System.out.println(a); 
		c.accept(10);
		Predicate<Integer> p = (a) -> a>10;
		System.out.println(p.test(12));
		Supplier<Integer> s = ()-> 10;
		System.out.println(s.get());
	}

}
