package lab04.tarefa02;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Bilhões e bilhões", "Carl Sagan", "descrição");
        Livro livro2 = new Livro("O mundo assombrado pelos demonios", "Carl Sagan", "a", "desrição");

        System.out.println("Livro 1: ");
        System.out.println(livro1.toString());

        System.out.println("-------------------------------");
        

        System.out.println("Livro 2: ");
        System.out.println(livro2.toString());
    }
}
