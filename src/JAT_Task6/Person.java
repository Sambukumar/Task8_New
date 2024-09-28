package JAT_Task6;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public static void main(String[] args) {
		
		Person person = new Person("Sambukumar", 29);
        System.out.println("Name: " + person.getName()); // Output: Name: Sambukumar
        System.out.println("Age: " + person.getAge());   // Output: Age: 29

	}

	

	

}
