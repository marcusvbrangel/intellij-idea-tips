package com.wolf.idea.model;

import org.springframework.util.Assert;

import java.util.Objects;
import java.util.UUID;

public class CategoriaID {

    private UUID id;

    public CategoriaID(UUID id) {
        Assert.notNull(id, "Id da Categoria não pode ser nulo");
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaID that = (CategoriaID) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
