package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Exibir 'Olá, Mundo!'");
        System.out.println("2. Exibir 'Bem-vindo ao C#'");
        System.out.println("3. Sair do programa");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: System.out.println("Olá, Mundo!"); break;
            case 2: System.out.println("Bem-vindo ao C#!"); break;
            case 3: System.out.println("Saindo..."); break;
            default: System.out.println("Opção inválida!"); break;
        }
        scanner.close();
    }
}