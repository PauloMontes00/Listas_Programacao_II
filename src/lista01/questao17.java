package lista01;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 1 para continuar e 2 para sair:");
        int op = sc.nextInt();

        do {
            System.out.println("Deseja continuar ? \n 1:sim \n 2:não");
            op = sc.nextInt();
            if (op == 2) {
                System.out.println("Saindo...");
            }
        } while(op == 1);
    }
}
//Crie um laço que pare quando o usuário digitar "sair".