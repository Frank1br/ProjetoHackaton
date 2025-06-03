package br.edu.fatecpg.interfaceJava;

import br.edu.fatecpg.interfaceJava.view.*;

import java.awt.GridLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame menu = new JFrame("Menu Principal");
        menu.setSize(300, 200);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setLayout(new GridLayout(3, 1));

        JButton produtosBtn = new JButton("Gerenciar Produtos");
        JButton clientesBtn = new JButton("Gerenciar Clientes");
        JButton vendasBtn = new JButton("Realizar Venda");

        produtosBtn.addActionListener(e -> new ProdutoView());
        clientesBtn.addActionListener(e -> new ClienteView());
        vendasBtn.addActionListener(e -> new VendaView());

        menu.add(produtosBtn);
        menu.add(clientesBtn);
        menu.add(vendasBtn);
        menu.setVisible(true);
    }
}
