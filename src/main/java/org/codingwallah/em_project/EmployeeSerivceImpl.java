package org.codingwallah.em_project;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service// chat gpt
public class EmployeeSerivceImpl implements EmployeeSerivce {
    @Autowired
    private EmployeeRepository employeeRepository;
    //List<Employee> employees=new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        //employees.add(employee);
        return "Saved succesfully";
    }
    @Override
    public Employee readEmployee(Long id) {
        EmployeeEntity employeeEntity=employeeRepository.findById(id).get();
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeEntity,employee);
        return employee;
    }
    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeesList=employeeRepository.findAll();
        List<Employee> employees=new ArrayList<>();
        for(EmployeeEntity employeeEntity:employeesList){
            Employee emp=new Employee();
            emp.setId(employeeEntity.getId());
            emp.setName(employeeEntity.getName());
            emp.setEmail(employeeEntity.getEmail());//if you want phone and id you can do
            emp.setPhone(employeeEntity.getPhone());
            employees.add(emp);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        /*employees.remove(id); sir
        return true;*/
       /* Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getId().equals(id)) {
                iterator.remove(); // ✅ Properly remove it
                return true;
            }
        }*/
        EmployeeEntity emp=employeeRepository.findById(id).get();
        employeeRepository.delete(emp);
        return true;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity exestingEmployee=employeeRepository.findById(id).get();
        exestingEmployee.setEmail(employee.getEmail());
        exestingEmployee.setName(employee.getName());
        exestingEmployee.setPhone(employee.getPhone());
        employeeRepository.save(exestingEmployee);
        return "Update Succesfully";
    }


}
