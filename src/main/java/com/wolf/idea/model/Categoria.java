package com.wolf.idea.model;

import java.util.Objects;
import java.util.UUID;

public class Categoria {

    private UUID id;

    private String nome;

    private Categoria(String nome) {
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public static Categoria of(String nome) {
        return new Categoria(nome);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
