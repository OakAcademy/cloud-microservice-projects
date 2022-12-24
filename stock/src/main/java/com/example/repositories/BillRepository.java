package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Bill;
@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
