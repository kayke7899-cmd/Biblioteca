package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private int quantidade;

    //Construtor1
    public Livro(String titulo,String autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = 0;
        this.quantidade = 0;

    }

    //Construtor2
    public Livro(String titulo,String autor,int ano,double preco,int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.quantidade = quantidade;

    }

// Exibir os dados do livro
    public void mostrarDados(){
        IO.println("Título: " + titulo);
        IO.println("Autor: " + autor);
        IO.println("Ano: " + ano);
        IO.println("Preço: R$" + preco);
        IO.println("Quantidade em estoque: " + quantidade);
        IO.println("--------------------------------------------------");
    }


    //Sobrecarga 1 adicionando apenas a quantidade
    public void adcionarEstoque(int quantidade){
        this.quantidade += quantidade;
        IO.println("Estoque de" + titulo + "aumentado em " + quantidade + " unidades. Estoque atual: " + this.quantidade);
    }

    //Sobrecarga 2 adicionando o fornecedor
    public void adcionarEstoque(int quantidade,String fornecedor){
        this.quantidade += quantidade;
        IO.println("Estoque de"+ titulo + "aumentado em" + quantidade + "unidade(s) pelo fornecedor " + fornecedor + ". Estoque atual: " + this.quantidade);
    }
}
