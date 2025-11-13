package lista01;

import java.io.PrintStream;
import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = (double)1000.0F;
        System.out.println("Bem-vindo ao caixa eletrônico!");

        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[]{saldo};
        var10000.println("Seu saldo inicial é: R$ " + String.format("%.2f", var10002));

        while(saldo > (double)0.0F) {
            System.out.print("\nDigite o valor que deseja sacar (ou 0 para sair): ");
            double valorSaque = scanner.nextDouble();
            if (valorSaque == (double)0.0F) {
                System.out.println("Obrigado por usar o caixa eletrônico!");
                break;
            }
            if (valorSaque <= (double)0.0F) {
                System.out.println("Por favor, digite um valor positivo para saque.");
            } else if (valorSaque > saldo) {
                var10000 = System.out;
                var10002 = new Object[]{saldo};
                var10000.println("Saldo insuficiente! Você só tem R$ " + String.format("%.2f", var10002));
            } else {
                saldo -= valorSaque;
                System.out.println("Saque realizado com sucesso!");
                var10000 = System.out;
                var10002 = new Object[]{saldo};
                var10000.println("Seu saldo atual é: R$ " + String.format("%.2f", var10002));
            }
        }
        if (saldo <= (double)0.0F) {
            System.out.println("\nSeu saldo é zero. O caixa eletrônico será encerrado.");
        }
        scanner.close();
    }
}
//Simule um caixa eletrônico que continue pedindo entradas até que o saldo do usuário seja zero.