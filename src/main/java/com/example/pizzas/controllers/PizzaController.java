package com.example.pizzas.controllers;
import com.example.pizzas.entity.Pizza;
import com.example.pizzas.repositorys.PizzaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PizzaController {

    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;

    }

    @GetMapping("/pizzas")
    public List<Pizza> pizzas(){
       return  pizzaRepository.findAll();
    }
}
