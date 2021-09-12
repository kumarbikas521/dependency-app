import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class parent {
	protected void showdeta() {
		System.out.println("p c");
	}
}

public class Test extends parent {

	protected final void showdeta() {
		// TODO Auto-generated method stub
		super.showdeta();
	}

}