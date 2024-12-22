package com.wolf.idea.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    @RequestMapping("/start")
    public ResponseEntity<String> start() {
        return ResponseEntity.ok("Hello World!");
    }

}
