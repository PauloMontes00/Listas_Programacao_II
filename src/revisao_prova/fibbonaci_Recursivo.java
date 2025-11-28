package revisao_prova;
import java.util.Scanner;

public class fibbonaci_Recursivo {

     static int calcFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return calcFib(n - 1) + calcFib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a posição que deseja chercar na sequencia de fibonacci:");
        int n = sc.nextInt();

        System.out.println("Fibonacci de " + n + " = " + calcFib(n));

    }
}
