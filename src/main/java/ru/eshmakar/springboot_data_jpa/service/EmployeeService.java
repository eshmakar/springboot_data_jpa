package ru.eshmakar.springboot_data_jpa.service;

import ru.eshmakar.springboot_data_jpa.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);//будет использована реализация от JpaRepository
}
