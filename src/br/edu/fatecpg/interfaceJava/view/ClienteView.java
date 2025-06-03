package br.edu.fatecpg.interfaceJava.view;

import br.edu.fatecpg.interfaceJava.models.Cliente;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ClienteView extends JFrame {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public ClienteView() {
        setTitle("Cadastro de Clientes");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JTextField idField = new JTextField();
        JTextField nomeField = new JTextField();
        JTextField creditoField = new JTextField();

        JButton cadastrar = new JButton("Cadastrar Cliente");

        cadastrar.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String nome = nomeField.getText();
            double credito = Double.parseDouble(creditoField.getText());
            clientes.add(new Cliente(id, nome, credito));
            JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
        });

        add(new JLabel("ID:")); add(idField);
        add(new JLabel("Nome:")); add(nomeField);
        add(new JLabel("Crédito:")); add(creditoField);
        add(cadastrar);

        setVisible(true);
    }
}