package lista01;

import java.io.PrintStream;
import java.util.Scanner;

public class questao28 {
    public static int mdc(int a, int b) {
        a = Math.abs(a);
        int r;
        for(int var4 = Math.abs(b); var4 != 0; var4 = r) {
            r = a % var4;
            a = var4;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois inteiros: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        PrintStream var10000 = System.out;
        int var10001 = mdc(a, b);
        var10000.println("MDC = " + var10001);
        sc.close();
    }
}
// Implemente uma versão do algoritmo de Euclides para encontrar o MDC de dois números.