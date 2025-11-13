package lista01;

public class questao09 {
    public static void main(String[] args) {
        System.out.println("Multiplos de 3:");
        int multiplo = 3;

        for(int i = 1; i <= 100; ++i) {
            int resultado = i * multiplo;
            System.out.println(resultado);
        }
    }
}
//Imprima os múltiplos de 3 entre 1 e 100.