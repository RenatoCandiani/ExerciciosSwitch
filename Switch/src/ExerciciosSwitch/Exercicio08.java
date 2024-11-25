package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a conversão de temperatura:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println("Temperatura em Fahrenheit: " + (temperatura * 9/5 + 32));
                break;
            case 2:
                System.out.println("Temperatura em Celsius: " + ((temperatura - 32) * 5/9));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}