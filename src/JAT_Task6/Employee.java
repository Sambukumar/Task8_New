package JAT_Task6;

public class Employee {
	
	private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Method to raise the salary by a percentage
    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            double raiseAmount = salary * (percentage / 100);
            salary += raiseAmount;
            System.out.println("Salary increased for "+firstName+" "+lastName +" whose ID is "+id+ " for the mentioned percentage "+ percentage + "% is " + salary);
        } else {
            System.out.println("Percentage must be greater than 0.");
        }
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public static void main(String[] args) {
    	
    	Employee empDetail=new Employee(123, "Sambu", "Kumar", 10000);
    	empDetail.raiseSalary(100);
	}

}
