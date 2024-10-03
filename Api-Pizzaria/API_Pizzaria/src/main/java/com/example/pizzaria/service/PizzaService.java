package com.example.pizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.pizzaria.models.Pizza;
import com.example.pizzaria.repository.PizzaRepository;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> listarTodasPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza cadastrarPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza buscarPizza(Long id) {
        Optional<Pizza> pizza = pizzaRepository.findById(id);
        return pizza.orElse(null);
    }

    public Pizza atualizarPizza(Long id, Pizza pizzaDetalhes) {
        Optional<Pizza> optionalPizza = pizzaRepository.findById(id);
        if (optionalPizza.isPresent()) {
            Pizza pizza = optionalPizza.get();
            pizza.setNome(pizzaDetalhes.getNome());
            pizza.setPreco(pizzaDetalhes.getPreco());
            return pizzaRepository.save(pizza);
        }
        return null;
    }

    public void deletarPizza(Long id) {
        if (pizzaRepository.existsById(id)) {
            pizzaRepository.deleteById(id);
        }
    }

}
