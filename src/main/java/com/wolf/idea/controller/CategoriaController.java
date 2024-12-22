package com.wolf.idea.controller;

import com.wolf.idea.dto.CategoriaResponse;
import com.wolf.idea.exception.CategoriaInvalidaException;
import com.wolf.idea.model.Categoria;
import com.wolf.idea.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @RequestMapping("/start")
    public ResponseEntity<String> start() {
        return ResponseEntity.ok("Hello World!");
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Categoria categoria) {
        Categoria categoriaCriada = null;
        try {
            categoriaCriada = categoriaService.salvar(categoria);
            return ResponseEntity.ok(convertCategoriaToCategoriaResponse(categoriaCriada));
        } catch (CategoriaInvalidaException exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }

    }

    private CategoriaResponse convertCategoriaToCategoriaResponse(Categoria categoria) {
        return new CategoriaResponse(categoria.getCategoriaID().getId().toString(), categoria.getNome());
    }

}
