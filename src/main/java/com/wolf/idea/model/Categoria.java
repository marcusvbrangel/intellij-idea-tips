package com.wolf.idea.model;

import java.util.Objects;
import java.util.UUID;

public class Categoria {

    private CategoriaID categoriaID;

    private String nome;

    private Categoria(CategoriaID categoriaID, String nome) {
        this.categoriaID = categoriaID;
        this.nome = nome;
    }

    public static Categoria of(String nome) {
        return new Categoria(new CategoriaID(UUID.randomUUID()), nome);
    }

    public CategoriaID getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(CategoriaID categoriaID) {
        this.categoriaID = categoriaID;
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
        return Objects.equals(categoriaID, categoria.categoriaID) && Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriaID, nome);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "categoriaID=" + categoriaID +
                ", nome='" + nome + '\'' +
                '}';
    }
}
