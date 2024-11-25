package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            switch (numero) {
                default:
                    for (int i = 1; i <= numero; i++) {
                        fatorial *= i;
                    }
                    System.out.println("Fatorial de " + numero + " é: " + fatorial);
                    break;
            }
        }
        scanner.close();
    }
}
