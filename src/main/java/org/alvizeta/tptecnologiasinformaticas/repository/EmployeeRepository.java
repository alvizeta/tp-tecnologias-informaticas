package org.alvizeta.tptecnologiasinformaticas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.alvizeta.tptecnologiasinformaticas.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
