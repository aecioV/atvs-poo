package lab04.tarefa01;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("12345", "Aecio");
        Pessoa p2 = new Pessoa("54321", "fulano");

        System.out.println("Dados da primeira pessoa: ");
        System.out.println(p1.toString());

        System.out.println("--------------------------");

        System.out.println("Dados da segunda pessoa: ");
        System.out.println(p2.toString());
    }
}
