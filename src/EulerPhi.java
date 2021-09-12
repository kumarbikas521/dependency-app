import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

public class EulerPhi {

	public static void main(String[] args) throws IOException {
		HashMap<Long, Long> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long count = 0;
		int c = 0;
		for (long i = 2; i <= s; i++) {

			long el = 0;
			if (new BigInteger(String.valueOf(i)).isProbablePrime(10)) {
				el = i - 1;
			} else {
				c++;
				/*
				 * long rem = 1; long temp = i; long n = 2; while (temp != 0) { if (temp % n ==
				 * 0) { rem = rem + map.get(n); if (new BigInteger(String.valueOf(temp %
				 * n)).isProbablePrime(10)) { rem = rem + map.get(temp % n); temp = 0; } } temp
				 * = temp % n; n++;
				 * 
				 * } System.out.println(i+" : "+rem); el = rem;
				 */

				long result = 1;
				for (long j = 2; j < i; j++) {
					if (new BigInteger(String.valueOf(j)).gcd(BigInteger.valueOf(i)).intValue() == 1) {
						result++;
					}

				}
				el = result;
			}
			map.put(i, el);

			if ((i - 1) % (i - el) == 0) {

				System.out.println(i + " : " + new BigInteger(String.valueOf(i)).isProbablePrime(10) + " : " + el
						+ " : " + (i - 1) + " : " + (i - el) + " : " + (i - 1) % (i - el));
				count = count + i;
			}

		}
		System.out.println(count);
		System.out.println(c);

	}

}
