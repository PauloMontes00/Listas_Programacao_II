package lista01;

public class questao03 {
    public static void main(String[] args) {
        int n = 50;
        int soma = n * (n + 1) / 2;
        System.out.println("Soma com fórmula: " + soma);
        int somaFor = 0;

        for(int i = 1; i <= n; ++i) {
            somaFor += i;
        }
        System.out.println("Soma com for: " + somaFor);
    }
}
// Calcule a soma de todos os números de 1 a 50.
