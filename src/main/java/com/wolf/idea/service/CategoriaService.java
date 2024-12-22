package com.wolf.idea.service;

import com.wolf.idea.model.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    public Categoria salvar(Categoria categoria) {
        return Categoria.of(categoria.getNome());
    }

}
