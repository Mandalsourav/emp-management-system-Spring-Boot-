package org.codingwallah.em_project;
import java.util.*;
public interface EmployeeSerivce {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id,Employee employee);

    Employee readEmployee(Long id);
}
