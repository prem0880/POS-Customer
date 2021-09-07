package com.pos.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.customer.entity.Customer;

@Repository
public interface ProfileRepository extends JpaRepository<Customer,Long>{

}