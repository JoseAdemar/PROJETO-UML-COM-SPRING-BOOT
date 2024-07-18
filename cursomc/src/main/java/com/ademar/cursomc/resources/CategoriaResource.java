package com.ademar.cursomc.resources;

import com.ademar.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> listaCategoria = new ArrayList<>();
        listaCategoria.add(cat1);
        listaCategoria.add(cat2);

        return listaCategoria;
    }
}
