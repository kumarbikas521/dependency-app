import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrimeWithLogic {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.valueOf(br.readLine());
		
		int count = 0;
	for (int i = 2; i <=n; i++) {
			if (checkprime(i)) {
				//System.out.println(i);
				count++;	
			}
			
		}
	System.out.println(count);
	}
	static Boolean checkprime(int n) {
		int flag = 0;
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) {
				//System.out.println(i);
				flag = 1;
			}
			
		}
		if (flag==0) {
			//System.out.println(n +" is prime number");
			return true;
		}
		else {
			//System.out.println(n +" is not prime number");
			return false;
		}
	}
}
