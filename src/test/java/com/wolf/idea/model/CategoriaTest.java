package com.wolf.idea.model;

import com.wolf.idea.exception.CategoriaInvalidaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void deveCriarCategoriaComAtributosValidos() {
        Categoria categoria = Categoria.of("Tecnologia");
        assertNotNull(categoria);
        assertEquals("Tecnologia", categoria.getNome());
        assertNotNull(categoria.getCategoriaID());
    }

    @Test
    void deveFalharAoCriarCategoriaComAtributosInvalidos() {
        CategoriaInvalidaException exception = assertThrows(CategoriaInvalidaException.class, () -> {
            Categoria.of(null);
        });
        assertEquals("Nome da categoria não pode ser nulo ou vazio", exception.getMessage());

        exception = assertThrows(CategoriaInvalidaException.class, () -> {
            Categoria.of("");
        });
        assertEquals("Nome da categoria não pode ser nulo ou vazio", exception.getMessage());

        exception = assertThrows(CategoriaInvalidaException.class, () -> {
            Categoria.of("   ");
        });
        assertEquals("Nome da categoria não pode ser nulo ou vazio", exception.getMessage());
    }
}