package com.example.repository.customer;

import com.example.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Modifying
    @Query(value = "update customer set is_delete = 1 where id=:key ", nativeQuery = true)
    void deleteLogic(@Param("key") int id);

    @Query(value = "select * from customer where is_delete = 0", nativeQuery = true)
    Page<Customer> searchAll(Pageable pageable);

}
