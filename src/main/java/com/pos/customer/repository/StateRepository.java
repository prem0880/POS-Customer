package com.pos.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.customer.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
