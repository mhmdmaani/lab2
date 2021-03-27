package example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryTest implements EmployeeRepository {

    public static List<Employee> employees = new ArrayList<Employee>();

    public  EmployeeRepositoryTest(List<Employee> employees){
        this.employees=employees;
    }
    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee save(Employee e) {
        employees.add(e);
        return employees.get(employees.indexOf(e));
    }
}