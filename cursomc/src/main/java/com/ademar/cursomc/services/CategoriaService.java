package com.ademar.cursomc.services;

import com.ademar.cursomc.domain.Categoria;
import com.ademar.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.get();
    }
}
