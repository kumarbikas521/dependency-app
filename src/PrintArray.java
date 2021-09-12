import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintArray {

	public static void main(String[] args) {
		Integer arr[]= {5,8,7,6,3,7,9};
		int ar[]= {8,5,9,7,3,8,1};
		List<Integer> l = Arrays.asList(arr);
		Collections.reverse(l);
		l.forEach(ele-> {
			System.out.print(ele);
		});
		System.out.println();
		arr= (Integer[]) l.toArray();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);			
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 7));
		Integer a[] = Arrays.copyOfRange(arr, 2,5);
		System.out.println(Arrays.toString(a));
		int ar1[]=new int[] {8,5,9,7,3,8,1};
		int ar2[]=new int[] {8,5,9,7,3,8,1};
		for (int i = 0; i < ar2.length; i++) {
			int max = 0;
			for (int j = 1; j < ar2.length; j++) {
				if (ar2[i]>ar2[j]) {
					int temp = ar2[i];
					ar2[i]=ar2[j];
					ar2[j]=temp;
				}
			}
		}
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
	}

}
