package com.example.my.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.my.projet.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}