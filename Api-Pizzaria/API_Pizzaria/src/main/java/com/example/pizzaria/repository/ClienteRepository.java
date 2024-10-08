package com.example.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {    
} 