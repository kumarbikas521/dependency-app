
public class MultiThreadingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThreadClass2 m1 = new myThreadClass2();
		Thread t = new Thread(m1);
		t.start();
		myThreadClass1 m2 = new myThreadClass1();
		m2.start();

	}

}

class myThreadClass1 extends Thread{
	@Override
	public void run() {
System.out.println("thread in thread class is running");	}
}
class myThreadClass2 implements Runnable{

	@Override
	public void run() {
System.out.println("My thread is running in runnable class");		
	}
	
}

