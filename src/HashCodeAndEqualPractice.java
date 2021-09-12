import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualPractice {
public static void main(String[] args) {
	Student s1 = new Student(1, "bikas");
	Student s2 = new Student(1, "bikas");
	Integer i1= new Integer(1);
	Integer i2= new Integer(1);
	Map<Integer, String> m1= new HashMap<>();
	Map<Student, String> m2 = new HashMap<>();
	m1.put(i1, "bikas");
	m1.put(i2, "kumar");
	m2.put(s1, "bikas");
	m2.put(s2, "kumar");
	System.out.println("content of m1 : "+m1);
	System.out.println("size of m1 : "+m1.size());
	System.out.println("size of m2 : "+m2.size());
	System.out.println("compare of integers with equals method : "+i1.equals(i2));
	System.out.println("compare of student object with equals method : "+s1.equals(s2));
	
}}
class Student{
	private int id ;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj!= null && obj instanceof Student) {
		int id = ((Student)obj).getId();
		System.out.println("id  :"+id);
		if(id == this.id) {
			String name = ((Student)obj).getName();
			System.out.println("name : "+name);
			if(name!=null && name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	return false;
	}
	
}
