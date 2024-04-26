// Person class
class Person {
    // Private variables encapsulate data
    private String name;
    private int age;

    // Constructor to initialize person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods to access private variables
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
        if (age > 0) {
            this.age = age;
        }
    }
}

// Employee class inheriting from Person
class Employee extends Person {
    // Private variables specific to Employee
    private String employeeId;
    private String department;

    // Constructor to initialize Employee
    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Public methods to access private variables
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// Main class to demonstrate encapsulation
public class Main {
    public static void main(String[] args) {
        // Create a Person instance
        Person person = new Person("John Doe", 30);

        // Access and modify encapsulated data using public methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());

        // Create an Employee instance
        Employee employee = new Employee("Jane Smith", 28, "E1234", "Engineering");

        // Access and modify encapsulated data using public methods
        System.out.println("\nEmployee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
    }
}
