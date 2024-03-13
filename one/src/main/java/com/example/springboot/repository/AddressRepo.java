package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {

}
