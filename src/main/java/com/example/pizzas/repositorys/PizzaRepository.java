package com.example.pizzas.repositorys;

import com.example.pizzas.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
