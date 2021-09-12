
public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector s1 = new GarbageCollector();
		GarbageCollector s2 = new GarbageCollector();
		s1 = null;
		s2 = null;
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object destroyed!!!!!!!!!");
	}

}
