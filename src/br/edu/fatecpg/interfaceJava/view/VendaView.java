package br.edu.fatecpg.interfaceJava.view;

import br.edu.fatecpg.interfaceJava.models.Cliente;
import br.edu.fatecpg.interfaceJava.models.Produto;

import javax.swing.*;
import java.awt.*;

public class VendaView extends JFrame {
    public VendaView() {
        setTitle("Realizar Venda");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JComboBox<Cliente> clienteBox = new JComboBox<>(ClienteView.clientes.toArray(new Cliente[0]));
        JComboBox<Produto> produtoBox = new JComboBox<>(ProdutoView.produtos.toArray(new Produto[0]));

        JButton vender = new JButton("Realizar Venda");

        vender.addActionListener(e -> {
            Cliente cliente = (Cliente) clienteBox.getSelectedItem();
            Produto produto = (Produto) produtoBox.getSelectedItem();
            if (cliente.getCredito() >= produto.getPreco()) {
                cliente.debitar(produto.getPreco());
                JOptionPane.showMessageDialog(null, "Venda realizada!");
            } else {
                JOptionPane.showMessageDialog(null, "Crédito insuficiente!");
            }
        });

        add(new JLabel("Selecionar Cliente:"));
        add(clienteBox);
        add(new JLabel("Selecionar Produto:"));
        add(produtoBox);
        add(vender);

        setVisible(true);
    }
}
