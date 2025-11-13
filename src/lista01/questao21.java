package lista01;

public class questao21 {
    public static void main(String[] args) {
        int n = 100;
        long a = 0L;
        long b = 1L;
        System.out.println("100 primeiros termos da sequência de Fibonacci:");

        for(int i = 0; i < n; ++i) {
            System.out.println(a + " ");
            long proximo = a + b;
            a = b;
            b = proximo;
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
// Imprima os primeiros 20 termos da sequência de Fibonacci.