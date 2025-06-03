package br.edu.fatecpg.interfaceJava.models;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String categoria;

    public Produto(int id, String nome, double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String toString() {
        return nome + " - R$" + preco;
    }
}
