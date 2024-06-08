public interface EmployeePrinter {
    default void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Position: " + employee.getPosition());
    }
}
