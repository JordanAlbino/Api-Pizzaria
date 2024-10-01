package com.example.pizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.pizzaria.models.Cliente;
import com.example.pizzaria.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepo;

    public List<Cliente> listarTodosClientes() {
        return clienteRepo.findAll();
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public Cliente buscarCliente(Long id) {
        Optional<Cliente> cliente = clienteRepo.findById(id);
        return cliente.orElse(null); 
    }

    public void deletarCliente(Long id) {
        if (clienteRepo.existsById(id)) {
            clienteRepo.deleteById(id);
        }
    }
}
