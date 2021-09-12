
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

public class TestC {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrSize = Integer.valueOf(br.readLine());
		String Sarr = br.readLine();
		Integer arr[] = new Integer[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = Integer.valueOf(Sarr.split(" ")[i]);
		}
		int noOfQuery = Integer.valueOf(br.readLine());
		for (int i = 0; i < noOfQuery; i++) {
			String query = br.readLine();
			if (query.contains("Increment")) {
				int pos = Integer.valueOf(query.split(" ")[1]);
				arr[pos] = arr[pos] + 1;
				System.out.println(Arrays.toString(arr));
			}
			if (query.contains("Update")) {
				int pos = Integer.valueOf(query.split(" ")[1]);
				int val = Integer.valueOf(query.split(" ")[2]);
				arr[pos] = val;
				System.out.println(Arrays.toString(arr));
			}
			if (query.contains("Left")) {
				int temp = arr[0];
				for (int j = 0; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = temp;
				System.out.println(Arrays.toString(arr));
			}
			if (query.contains("Right")) {
				int temp = arr[arr.length - 1];
				for (int j = arr.length - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
				System.out.println(Arrays.toString(arr));
			}
			if (query.contains("?")) {
				System.out.println(Arrays.toString(arr));
				int pos = Integer.valueOf(query.split(" ")[1]);
				System.out.println(arr[pos]);
			}

		}
	}
}
