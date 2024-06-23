package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmpleadoEntity;
@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, String> {

	
}
