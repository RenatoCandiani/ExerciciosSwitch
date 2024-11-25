package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do salário: R$ ");
        double salario = scanner.nextDouble();

        int faixa = salario <= 1500 ? 1 : salario <= 3000 ? 2 : 3;

        switch (faixa) {
            case 1:
                System.out.println("Imposto: R$ " + (salario * 0.05));
                break;
            case 2:
                System.out.println("Imposto: R$ " + (salario * 0.10));
                break;
            case 3:
                System.out.println("Imposto: R$ " + (salario * 0.15));
                break;
            default:
                System.out.println("Erro no cálculo!");
                break;
        }
        scanner.close();
    }
}