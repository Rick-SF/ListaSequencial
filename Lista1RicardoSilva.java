package Exe_lista;
import java.util.Scanner;

public class Lista1RicardoSilva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        RegistroAgenda[] agenda = new RegistroAgenda[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Insira o " +(i + 1)+ "° nome: ");
            String nome = leitor.nextLine();

            System.out.println("Insira o telefone da " +(i+ 1)+ "° pessoa: ");
            String telefone = leitor.nextLine();

            agenda[i] = new RegistroAgenda(nome, telefone);
        }

    System.out.println("\nAgenda Telefônica:");
    for(int i = 0; i < 10; i++){
        System.out.println("Contato " +(i + 1)+ ": " +agenda[i]);
    }
    leitor.close();
    }
}
