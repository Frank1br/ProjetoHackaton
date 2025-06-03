
# 🛒 Sistema de Vendas com Interface Swing

## 📌 Visão Geral

Este projeto consiste em um sistema simples de vendas com interface gráfica desenvolvida em Java utilizando **Swing**. Os usuários podem cadastrar produtos e clientes, além de realizar vendas respeitando o crédito disponível de cada cliente.

---

## 🧱 Estrutura de Pacotes

```
br.edu.fatecpg.interfaceJava
│
├── models         → Contém os modelos de dados (Cliente, Produto)
├── view           → Contém as interfaces gráficas (Swing)
└── Main.java      → Classe principal que exibe o menu inicial
```

---

## 🧩 Classes e Funcionalidades

### ✅ `Produto`
- Representa um item à venda.
- Atributos: `id`, `nome`, `preco`, `categoria`.
- Método `toString()` exibe o nome e o preço formatado.

### ✅ `Cliente`
- Representa um comprador com limite de crédito.
- Atributos: `id`, `nome`, `credito`.
- Método `debitar(valor)` reduz o crédito disponível.
- Método `toString()` exibe o nome e o crédito restante.

---

## 🖼 Telas do Sistema

### 🧾 ProdutoView
- Interface para cadastro de produtos.
- Campos: ID, Nome, Preço, Categoria.
- Ao cadastrar, o produto é adicionado à lista estática `produtos`.

### 👤 ClienteView
- Interface para cadastro de clientes.
- Campos: ID, Nome, Crédito.
- Ao cadastrar, o cliente é adicionado à lista estática `clientes`.

### 🛍 VendaView
- Interface de vendas.
- Permite selecionar um cliente e um produto.
- Verifica se o cliente possui crédito suficiente.
- Debita o valor do produto, se possível, e exibe mensagem.

### 🧭 Main
- Tela principal com três botões:
  - Gerenciar Produtos
  - Gerenciar Clientes
  - Realizar Venda

---

## 🛠 Tecnologias Utilizadas

- **Java SE**
- **Swing** para criação da interface gráfica.
- **ArrayList** para armazenar produtos e clientes temporariamente.

---

## ⚙️ Funcionalidades

| Funcionalidade       | Descrição                                                      |
|----------------------|----------------------------------------------------------------|
| Cadastro de Produto  | Armazena dados de novos produtos no sistema.                   |
| Cadastro de Cliente  | Armazena dados de novos clientes e seu crédito inicial.        |
| Venda                | Permite realizar venda entre cliente e produto com verificação de crédito. |

---

## 🔁 Possíveis Melhorias Futuras

- Persistência em banco de dados ou arquivo.
- Validações mais robustas nas entradas de dados.
- Exibição de histórico de vendas.
- Interface mais moderna e responsiva.
- Suporte para múltiplas vendas por transação.

---

## 👨‍💻 Autor

- Desenvolvido como exercício acadêmico para fins de aprendizado e prática com Java e Swing.

- Frank Oliveira

---

## 📄 Licença

Este projeto é de uso livre para fins acadêmicos ou pessoais. Sem garantias de funcionamento em produção.
