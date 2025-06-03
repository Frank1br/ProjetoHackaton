package br.edu.fatecpg.interfaceJava.models;

public class Cliente {
    private int id;
    private String nome;
    private double credito;

    public Cliente(int id, String nome, double credito) {
        this.id = id;
        this.nome = nome;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getCredito() {
        return credito;
    }

    public void debitar(double valor) {
        if (valor <= credito) {
            credito -= valor;
        }
    }

    public String toString() {
        return nome + " - Crédito: R$" + credito;
    }
}