package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        switch (idade / 10) {
            case 0: case 1: System.out.println("Criança"); break;
            case 2: System.out.println("Adolescente"); break;
            case 3: case 4: case 5: System.out.println("Adulto"); break;
            default: System.out.println("Idoso"); break;
        }
        scanner.close();
    }
}