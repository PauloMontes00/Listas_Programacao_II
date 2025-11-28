package revisao_prova;

import java.util.Scanner;

public class fatorial_Recursivo {

    static int calcFat(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcFat(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um caso base para calcular o fatorial:");
        int n = sc.nextInt();

        int resultado = calcFat(n);
        System.out.println("Fatorial de " + n + " = " + resultado);

        sc.close();
    }
}
