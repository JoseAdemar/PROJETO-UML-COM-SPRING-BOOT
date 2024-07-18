package com.ademar.cursomc.resources;

import com.ademar.cursomc.domain.Categoria;
import com.ademar.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find (@PathVariable Long id) {
       Categoria categoria = categoriaService.buscar(id);
       return ResponseEntity.ok(categoria);
    }
}
