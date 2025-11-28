package revisao_prova;
import java.util.Scanner;

public class potencia_Recursiva {
    static int potencia(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * potencia(n, p - 1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o valor de n e p:");
       int n = sc.nextInt();
       int p = sc.nextInt();

       System.out.println("Potencia de "+n+" elevado a "+p+" = "+potencia(n, p));
    }
}
