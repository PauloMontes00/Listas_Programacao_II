package lista01;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int n = sc.nextInt();
        boolean primo = true;

        if (n < 2) {
            primo = false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        sc.close();
    }
}
//Verifique se um número é primo ou não.