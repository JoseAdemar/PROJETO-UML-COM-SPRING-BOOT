package com.ademar.cursomc.resources;

import com.ademar.cursomc.domain.Cliente;
import com.ademar.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find (@PathVariable Long id) {
        Cliente cliente = clienteService.buscar(id);
        return ResponseEntity.ok(cliente);
    }
}
