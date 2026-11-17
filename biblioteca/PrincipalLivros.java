package biblioteca;
import java.util.Scanner;
public class PrincipalLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cadastro do livro 1 (sem preço e quantidade inicial)
        IO.println("=== Cadastro do Livro 1 ===");
        IO.print("Título:");
        String titulo1 = sc.nextLine();
        IO.print("Autor:");
        String autor1 = sc.nextLine();
        IO.print("Ano:");
        int ano1 = sc.nextInt();
        IO.print("Preço:");
        double preco1 = sc.nextDouble();
        IO.print("Quantidade em estoque:");
        int quantidade1 = sc.nextInt();
        Livro l1 = new Livro(titulo1, autor1, ano1, preco1, quantidade1);
        l1.mostrarDados();
        sc.nextLine();

        //Cadastro do livro 2 (com preço e quantidade inicial)
        IO.println("=== Cadastro do Livro 2 (com preço e quantidade inicial) ===");
        IO.print("Título:");
        String titulo2 = sc.nextLine();
        IO.print("Autor:");
        String autor2 = sc.nextLine();
        IO.print("Ano:");
        int ano2 = sc.nextInt();
        IO.print("Preço:");
        double preco2 = sc.nextDouble();
        IO.print("Quantidade em estoque:");
        int quantidade2 = sc.nextInt();
        Livro l2 = new Livro(titulo2, autor2, ano2, preco2, quantidade2);
        l2.mostrarDados();
        sc.nextLine();

        //Cadastro do livro 3 (com preço e quantidade inicial)
        IO.println("=== Cadastro do Livro 3 (com preço e quantidade inicial) ===");
        IO.print("Título:");
        String titulo3 = sc.nextLine();
        IO.print("Autor:");
        String autor3 = sc.nextLine();
        IO.print("Ano:");
        int ano3 = sc.nextInt();
        IO.print("Preço:");
        double preco3 = sc.nextDouble();
        IO.print("Quantidade em estoque:");
        int quantidade3 = sc.nextInt();
        Livro l3 = new Livro(titulo3, autor3, ano3, preco3, quantidade3);
        l3.mostrarDados();
        sc.nextLine();

        //Adcionando ao estoque (com fornecedor + quantidade)
        IO.println("=== Adicionando ao estoque(com fornecedor + quantidade) ===");
        IO.print("Quantidade a ser adicionada:");
        int quantidadeAdicional = sc.nextInt();
        IO.print("Fornecedor:");
        String fornecedor = sc.nextLine();
        l1.adcionarEstoque(quantidadeAdicional, fornecedor);
        l2.adcionarEstoque(quantidadeAdicional, fornecedor);
        l3.adcionarEstoque(quantidadeAdicional, fornecedor);

    }     
    
}
