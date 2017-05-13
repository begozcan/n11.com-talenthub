package com.frankmoley.landon.data.repository;

import com.frankmoley.landon.data.entity.Customer;
import com.frankmoley.landon.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}