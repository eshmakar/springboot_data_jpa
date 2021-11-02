package ru.eshmakar.springboot_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eshmakar.springboot_data_jpa.entity.Employee;

import java.util.List;

//абсолютно все функции по нахождению работника по id, получение списка всех работников,
//их сохранение и удаление и т.д. все это описывается внутри JpaRepository
//поэтому нам остается только выбрать правильные названия методов из JpaRepository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
    public List<Employee> findAllByName(String name);//используя JpaRepository выбираем название метода, чтобы самим не писать код
}
