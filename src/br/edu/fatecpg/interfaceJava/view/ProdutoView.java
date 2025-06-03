package br.edu.fatecpg.interfaceJava.view;

import br.edu.fatecpg.interfaceJava.models.Produto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProdutoView extends JFrame {
    public static ArrayList<Produto> produtos = new ArrayList<>();

    public ProdutoView() {
        setTitle("Cadastro de Produtos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JTextField idField = new JTextField();
        JTextField nomeField = new JTextField();
        JTextField precoField = new JTextField();
        JTextField categoriaField = new JTextField();

        JButton cadastrar = new JButton("Cadastrar Produto");

        cadastrar.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String nome = nomeField.getText();
            double preco = Double.parseDouble(precoField.getText());
            String categoria = categoriaField.getText();
            produtos.add(new Produto(id, nome, preco, categoria));
            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
        });

        add(new JLabel("ID:")); add(idField);
        add(new JLabel("Nome:")); add(nomeField);
        add(new JLabel("Preço:")); add(precoField);
        add(new JLabel("Categoria:")); add(categoriaField);
        add(cadastrar);

        setVisible(true);
    }
}
