package com.nextcare_f.nextcare_f.dao;

import com.nextcare_f.nextcare_f.dto.Hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Integer>{
  
}
