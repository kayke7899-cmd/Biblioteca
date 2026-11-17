# 📚 Biblioteca

Sistema de console em **Java** para cadastro e controle de estoque de livros, desenvolvido como projeto de estudo de **Programação Orientada a Objetos (POO)**.

![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?logo=visualstudiocode&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)

---

## 📖 Sobre o projeto

A aplicação permite cadastrar livros via terminal, exibir seus dados e adicionar unidades ao estoque, opcionalmente informando o fornecedor. O foco do projeto é praticar conceitos fundamentais de POO em Java:

- **Encapsulamento**: atributos privados dentro da classe `Livro`.
- **Sobrecarga de construtores**: criação de um livro apenas com título, autor e ano, ou com preço e quantidade inicial.
- **Sobrecarga de métodos**: `adcionarEstoque` pode receber só a quantidade, ou a quantidade e o fornecedor.
- **Entrada de dados** com `Scanner` e saída com a classe `IO`.

## ✨ Funcionalidades

- Cadastro de livros com título, autor, ano, preço e quantidade em estoque
- Exibição formatada dos dados de cada livro
- Adição de unidades ao estoque
- Registro do fornecedor na reposição de estoque

## 🗂️ Estrutura do projeto

```
Biblioteca/
└── biblioteca/
    ├── Livro.java            # Classe modelo (atributos, construtores e métodos)
    └── PrincipalLivros.java  # Classe principal com o fluxo de interação
```

### Classe `Livro`

| Atributo     | Tipo     | Descrição                |
|--------------|----------|--------------------------|
| `titulo`     | `String` | Título do livro          |
| `autor`      | `String` | Autor do livro           |
| `ano`        | `int`    | Ano de publicação        |
| `preco`      | `double` | Preço em reais           |
| `quantidade` | `int`    | Unidades em estoque      |

| Método                                          | Descrição                                           |
|-------------------------------------------------|-----------------------------------------------------|
| `Livro(titulo, autor, ano)`                     | Construtor com preço e quantidade iniciando em zero |
| `Livro(titulo, autor, ano, preco, quantidade)`  | Construtor completo                                 |
| `mostrarDados()`                                | Exibe os dados do livro no console                  |
| `adcionarEstoque(quantidade)`                   | Soma unidades ao estoque                            |
| `adcionarEstoque(quantidade, fornecedor)`       | Soma unidades e informa o fornecedor                |

## 🛠️ Tecnologias

- [Java](https://openjdk.org/) (JDK 25 ou superior, necessário para a classe `IO`)
- [Visual Studio Code](https://code.visualstudio.com/) com o [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## 🚀 Como executar

### Pré-requisitos

- JDK 25 ou superior instalado (`java -version` para conferir)
- Git (opcional, para clonar o repositório)

### Pelo terminal

```bash
# Clonar o repositório
git clone https://github.com/kayke7899-cmd/Biblioteca.git
cd Biblioteca

# Compilar
javac biblioteca/*.java

# Executar
java biblioteca.PrincipalLivros
```

### Pelo VS Code

1. Abra a pasta do projeto no VS Code.
2. Instale o **Extension Pack for Java**, caso ainda não tenha.
3. Abra o arquivo `PrincipalLivros.java`.
4. Clique em **Run** acima do método `main`, ou pressione `F5`.

## 💻 Exemplo de uso

```
=== Cadastro do Livro 1 ===
Título:Dom Casmurro
Autor:Machado de Assis
Ano:1899
Preço:39.9
Quantidade em estoque:10
Título: Dom Casmurro
Autor: Machado de Assis
Ano: 1899
Preço: R$39.9
Quantidade em estoque: 10
--------------------------------------------------
```

## 🔮 Melhorias futuras

- [ ] Menu interativo para cadastrar, listar, buscar e remover livros
- [ ] Armazenar os livros em uma lista (`ArrayList<Livro>`)
- [ ] Validação das entradas do usuário
- [ ] Persistência dos dados em arquivo ou banco de dados
- [ ] Métodos `get` e `set` para os atributos
- [ ] Testes unitários com JUnit

## 👤 Autor

**Kayke Augusto Martins Araujo**

- GitHub: [@kayke7899-cmd](https://github.com/kayke7899-cmd)
- LinkedIn: _adicione o link do seu perfil_

---

Projeto desenvolvido para fins educacionais.
