package com.ademar.cursomc.services;

import com.ademar.cursomc.domain.Categoria;
import com.ademar.cursomc.repositories.CategoriaRepository;
import com.ademar.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto de id " + id + " não encontrado"));
        return categoria;
    }
}
