package com.example.repository.employee;

import com.example.model.customer.Customer;
import com.example.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    @Modifying
    @Query(value = "update employee set is_delete = 1 where id=:key ", nativeQuery = true)
    void deleteLogic(@Param("key") int id);

    @Query(value = "select * from employee where is_delete = 0", nativeQuery = true)
    Page<Employee> searchAll(Pageable pageable);
}
