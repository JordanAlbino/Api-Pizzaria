package com.example.pizzaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pizzaria.models.Pizza;
import com.example.pizzaria.repository.PizzaRepository;

@RestController
@RequestMapping("/pizzas")
@CrossOrigin(origins = "*")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> getPizzaById(@PathVariable Long id) {
        Optional<Pizza> pizza = pizzaRepository.findById(id);
        return pizza.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pizza> updatePizza(@PathVariable Long id, @RequestBody Pizza pizzaDetails) {
        Optional<Pizza> optionalPizza = pizzaRepository.findById(id);

        if (optionalPizza.isPresent()) {
            Pizza pizza = optionalPizza.get();
            pizza.setNome(pizzaDetails.getNome());
            pizza.setPreco(pizzaDetails.getPreco());

            return ResponseEntity.ok(pizzaRepository.save(pizza));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@PathVariable Long id) {
        Optional<Pizza> pizza = pizzaRepository.findById(id);

        if (pizza.isPresent()) {
            pizzaRepository.delete(pizza.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
