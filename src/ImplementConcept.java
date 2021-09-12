import java.util.Comparator;
import java.util.TreeSet;

public class ImplementConcept {

	public static void main(String[] args) {
		TreeSet<Integer> st = new TreeSet<>(new T2());
		st.add(5);
		st.add(50);
		st.add(555);
		st.add(15);
		st.add(65);
		st.add(25);
		System.out.println(st);
	}

}

class T2 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		}
		return 0;
	}

}
