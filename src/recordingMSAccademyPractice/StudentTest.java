package recordingMSAccademyPractice;

public class StudentTest {
	
	
	public static void main(String[] args) {
		Student s=new Student(1,"Jamshed",26);
		System.out.println(s.toString());
	}
	
	
}

class Student {
	int id;
	String name;
	int age;
	
	
	
	public Student() {
		super();
	}



	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "StudentTest [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
