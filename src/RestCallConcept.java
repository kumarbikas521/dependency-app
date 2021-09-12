
public class RestCallConcept {

	public static void main(String[] args) {
		T1 t = new T1();
		t.display();
	}

}

class T1 {
	String s1 = "test";
	String s2 = new String("test");

	void display() {
		System.out.println(s1==s2);
	}
}
