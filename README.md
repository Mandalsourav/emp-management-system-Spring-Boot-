# 👩‍💼 Employee Management System (Spring Boot)

This is a simple Employee Management System built using **Spring Boot**, **Spring Data JPA**, and **H2 Database**. It allows basic CRUD operations (Create, Read, Update, Delete) on employee data.

## 🚀 Features

- Add new employees
- View all employees
- Update employee details
- Delete employee by ID
- View single employee by ID
- RESTful API using Spring Boot

## 🧰 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Lombok (for boilerplate code reduction)

## 🗂️ Project Structure

src
├── main
│ ├── java
│ │ └── org.codingwallah.em_project
│ │ ├── EmProjectApplication.java # Main Spring Boot application
│ │ ├── EmpController.java # REST controller layer
│ │ ├── EmployeeService.java # Service interface
│ │ ├── EmployeeServiceImpl.java # Service implementation
│ │ ├── EmployeeRepository.java # JPA Repository
│ │ ├── Employee.java # Model/DTO class
│ │ └── EmployeeEntity.java # Entity class for database
│ └── resources
│ └── application.properties # Configurations
└── test
└── org.codingwallah.em_project
└── EmProjectApplicationTests.java # Test file
