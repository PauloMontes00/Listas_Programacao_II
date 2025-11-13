package lista01;

import java.util.Random;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número (entre 1 e 100).");

        int tentativa;
        do {
            System.out.print("Digite seu chute: ");
            tentativa = sc.nextInt();
            ++tentativas;
            if (tentativa > numeroSecreto) {
                System.out.println("\ud83d\udd3b Muito alto! Tente um número menor.");
            } else if (tentativa < numeroSecreto) {
                System.out.println("\ud83d\udd3a Muito baixo! Tente um número maior.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while(tentativa != numeroSecreto);
        sc.close();
    }
}

/**
 * Implemente um jogo de adivinhação onde o computador escolhe um número e o usuário tenta adivinhar,
 ajude o usuário informando se o chute foi alto ou baixo.
 **/