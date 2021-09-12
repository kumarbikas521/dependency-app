import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		Employee e1 = new Employee("bikas", "male", 30000);
		Employee e2 = new Employee("rita", "female", 21000);
		Employee e3 = new Employee("rinku", "female", 19000);
		Employee e4 = new Employee("ganesh", "male", 15000);
		Employee e5 = new Employee("richa", "female", 25000);
		List<Employee> li = new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		Predicate<Employee> p = (emp) -> {
			if (emp.salary > 20000 && emp.sex == "female") {
				return true;
			} else {
				return false;
			}
		};
		List<Employee> filtered = li.stream().filter(p).collect(Collectors.toList());
		filtered.stream().forEach((e) -> System.out.println(e.name));

		String str = "bikas";
		char c[] = str.toCharArray();
		Arrays.sort(c);
		String sorted = new String(c);
		System.out.println(sorted);
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
		int a[] = { 1, 2, 3, 4, 5, 6 };

		int num = 687;
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		sb = sb.reverse();
		int re = Integer.valueOf(String.valueOf(sb));
		System.out.println(re);
		int temp = num;
		int a1 = 0;
		int b = 0;
		while (temp % 10 > 0) {
			a1 = temp % 10; // 7
			a1 = a1 + b*10; // 70
			b = a1;
			temp  = temp / 10; // 68

		}
		System.out.println(a1);
		int a2[]= {2,5,6};
		int b2[]= {2,5,6};
		System.out.println();
		System.out.println(a2.toString()==b2.toString());
	}
	
	

}
