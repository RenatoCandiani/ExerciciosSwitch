package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a classificação do filme (G, PG, PG-13, R): ");
        String classificacao = scanner.next().toUpperCase();

        switch (classificacao) {
            case "G":
                System.out.println("Faixa etária: Livre");
                break;
            case "PG":
                System.out.println("Faixa etária: Maior de 10 anos");
                break;
            case "PG-13":
                System.out.println("Faixa etária: Maior de 13 anos");
                break;
            case "R":
                System.out.println("Faixa etária: Maior de 18 anos");
                break;
            default:
                System.out.println("Classificação inválida!");
                break;
        }
        scanner.close();
    }
}