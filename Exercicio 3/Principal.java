import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("Cadastro do livro");
        System.out.print("Nome: ");
        livro.setNome(sc.nextLine());
        System.out.print("Preco: ");
        livro.setPreco(Double.parseDouble(sc.nextLine().replace(",", ".")));
        System.out.print("Autor: ");
        livro.setAutor(sc.nextLine());

        System.out.println();
        System.out.println("Cadastro do CD");
        System.out.print("Nome: ");
        cd.setNome(sc.nextLine());
        System.out.print("Preco: ");
        cd.setPreco(Double.parseDouble(sc.nextLine().replace(",", ".")));
        System.out.print("Numero de faixas: ");
        cd.setNumFaixas(Integer.parseInt(sc.nextLine()));

        System.out.println();
        System.out.println("Informacoes do CD cadastrado");
        cd.exibeInformacoes();

        sc.close();
    }
}
