// Student.java
public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an instance of Student class
        Student student = new Student("John", 20);

        // Printing student's information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Modifying student's information using setters
        student.setName("Alice");
        student.setAge(22);

        // Printing modified student's information
        System.out.println("\nModified Student Name: " + student.getName());
        System.out.println("Modified Student Age: " + student.getAge());
    }
}
