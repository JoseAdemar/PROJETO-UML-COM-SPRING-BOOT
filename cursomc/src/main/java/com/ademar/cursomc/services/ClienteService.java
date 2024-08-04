package com.ademar.cursomc.services;

import com.ademar.cursomc.domain.Cliente;
import com.ademar.cursomc.repositories.ClienteRepository;
import com.ademar.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto de id " + id + " não encontrado"));
        return cliente;
    }
}
