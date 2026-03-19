package com.capgemini.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.entity.Company;

public interface companyRepository extends JpaRepository<Company, Integer>{

}
