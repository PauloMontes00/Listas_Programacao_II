package lista01;

public class questao14 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 1000");

        for(int n = 2; n <= 1000; ++n) {
            boolean primo = true;

            for(int i = 2; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(n + " ");
            }
        }
    }
}
//Escreva um programa que imprima todos os números primos entre 1 e 1000.