import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(45);
		data.add(45);
		data.add(455);
		data.add(5534);
		data.add(52);
		data.add(51);
		System.out.println(data.get(0));
		Optional<Integer> sum = data.stream().reduce((a,b)->a+b);
		if (sum.isPresent()) {
			System.out.println(sum.get());
		} else {
			System.out.println("sum is zero");
		}
		List<Integer> li = data.stream().distinct().collect(Collectors.toList());
		System.out.println(li);
		List<Integer> li1 = data.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(li1);
		List<Integer> li2 = data.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(li2);
		List<Integer> li3 = data.stream().sorted((i1,i2)-> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println(li3);
		List<Integer> li4 = data.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(li4);
		int li7 = data.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(li7);
		
		Consumer<Integer> c = (i)-> System.out.println("Sqaure of "+i+" is : "+i*i);
		data.stream().forEach(c);
		
		
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("bittu");
		data1.add("bikas kumar");
		data1.add("raj kamal");
		data1.add("karishna");
		data1.add("pk kumar");
		data1.add("jk shah");
		List<String> li5 = data1.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(li5);
		List<String> li6 = data1.stream().sorted((i1,i2)-> (i1.length()>i2.length())?11:(i1.length()<i2.length())?-1:0).collect(Collectors.toList());
		System.out.println(li6);
      
		
		int arr[]= {5,7,5,4,56,8,5,2,7,625,5,8};
		Arrays.parallelSort(arr);
		Optional<int[]> o = Optional.ofNullable(arr);
		System.out.println();
		

	}
}
