package lista01;

import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito inicial (C): ");
        double capitalInicial = scanner.nextDouble();
        System.out.print("Digite a taxa de juros anual (em percentual, ex: 10 para 10%): ");
        double taxaPercentual = scanner.nextDouble();
        System.out.print("Digite o tempo em anos (t): ");
        double tempoAnos = scanner.nextDouble();
        double taxaAnualDecimal = taxaPercentual / (double)100.0F;
        double montanteFinal = capitalInicial * Math.pow((double)1.0F + taxaAnualDecimal, tempoAnos);
        System.out.println("\nMontante final após " + tempoAnos + " anos: R$ " + montanteFinal);
        scanner.close();
    }
}
//Faça o cálculo de juros compostos para uma série de depósitos, solicite o tempo e a taxa de juros anual.