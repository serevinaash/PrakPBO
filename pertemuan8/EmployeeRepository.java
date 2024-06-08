import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    private Map<String, Employee> employeeMap = new HashMap<>();

    public void saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public Employee getEmployeeById(String id) {
        return employeeMap.get(id);
    }
}
