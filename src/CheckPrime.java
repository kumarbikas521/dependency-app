import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckPrime {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long i = Long.valueOf(br.readLine());
//		int count = 0 ;
//		for (long j = 2; j <= i; j++) {
//			if (new BigInteger(String.valueOf(j)).isProbablePrime(10)) {
//				//System.out.println(j);
//				count++;
//			}
//		}
//		System.out.println(count);
		
		int arr[] = {1,2,3,8,45,75,5};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			a.add(Integer.valueOf(arr[i]));
		}
		//ArrayList<Integer> a = Arrays.asList(arr);
		System.out.println(a.contains(45));
	}

}
