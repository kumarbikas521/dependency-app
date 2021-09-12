import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapInterfaceConcept {

	public static void main(String[] args) {
		// System.out.println(Integer.valueOf(5).hashCode());
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "bikas");
		m.put(2, "kk");
		m.put(3, "Ravi");
		m.put(4, "bikas");
		m.put(5, "kk");
		m.put(6, "Ravi");
		m.put(7, "bikas");
		m.put(8, "kk");
		m.put(9, "Ravi");
		m.put(10, "bikas");
		m.put(11, "kk");
		m.put(12, "Ravi");
		m.put(13, "bikas");
		m.put(14, "kk");
		m.put(15, "Ravi");
		m.put(16, "bikas");
		m.put(17, "kk");
		m.put(18, "Ravi");
		BiConsumer<Integer,String> c = (i,j) -> System.out.println(j);
		m.forEach(c);
		
		
		EmployeeClassForTest e1 = new EmployeeClassForTest(1,"bikas");
		EmployeeClassForTest e2 = new EmployeeClassForTest(1,"bikas");
		System.out.println(e1.equals(e2));
		Map<EmployeeClassForTest, Integer> m1 = new HashMap<EmployeeClassForTest, Integer>();
		m1.put(e1, 1);
		m1.put(e2, 1);
		System.out.println(m1.size());
//		while (true) {
//			System.out.println("Hello");
//			
//		}
//		
	}

}
