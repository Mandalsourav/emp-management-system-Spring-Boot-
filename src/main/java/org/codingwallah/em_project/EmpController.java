package org.codingwallah.em_project;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {
   // List<Employee> employees=new ArrayList<>();
    //@Autowired//sir
   // EmployeeSerivce employeeSerivce=new EmployeeSerivceImpl(); //sir
    //dependency injuction::
    @Autowired//chatGpt
   EmployeeSerivce employeeSerivce;//chatGpt
    @GetMapping("employees")//for read
    public List<Employee> getMethodName(){
        return employeeSerivce.readEmployees();
    }
    @GetMapping("employees/{id}")//for read
    public Employee getEmployyedById(@PathVariable Long id){
        return employeeSerivce.readEmployee(id);
    }

    @PostMapping("employees")//for read
    public String createEmployee(@RequestBody Employee employee){
       // employees.add(employee);
       return employeeSerivce.createEmployee(employee);

    }
    @DeleteMapping("employees/{id}")
    public String deletEmployee(@PathVariable Long id){
       if( employeeSerivce.deleteEmployee(id)){
           return "DELETE Succes";
       }
       else{
           return "Not found";
       }
    }
    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id,@RequestBody Employee employee){
       return employeeSerivce.updateEmployee(id,employee);
    }
}
