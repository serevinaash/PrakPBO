public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("1", "John", "Software Engineer");

        EmployeeRepository repository = new EmployeeRepository();
        repository.saveEmployee(employee);

        EmployeePrinter printer = new EmployeePrinter() {
        };
        printer.printEmployeeDetails(repository.getEmployeeById("1"));
    }
}
