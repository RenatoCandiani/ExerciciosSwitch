package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 10): ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 9: case 10: System.out.println("Classificação: A"); break;
            case 7: case 8: System.out.println("Classificação: B"); break;
            case 5: case 6: System.out.println("Classificação: C"); break;
            case 3: case 4: System.out.println("Classificação: D"); break;
            case 0: case 1: case 2: System.out.println("Classificação: F"); break;
            default: System.out.println("Nota inválida!"); break;
        }
        scanner.close();
    }
}