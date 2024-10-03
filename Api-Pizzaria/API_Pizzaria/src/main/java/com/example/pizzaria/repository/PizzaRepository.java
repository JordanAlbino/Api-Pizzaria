package com.example.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pizzaria.models.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}