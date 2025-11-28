package revisao_prova;
import java.util.Scanner;

public class soma_recursiva {

    static int soma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + soma(n -1);
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor de n para a soma recursiva da sequencia até n:");
    int n = sc.nextInt();

    System.out.println("Soma da sequencia até "+n+" = "+soma(n));
    }
}