package lista01;

public class questao20 {
    public static void main(String[] args) {
        int[] numeros = new int[]{5, 8, 3, 15, 2, 10, 7};
        int min = numeros[0];
        int max = numeros[0];

        for(int i = 1; i < numeros.length; ++i) {
            if (numeros[i] < min) {
                min = numeros[i];
            }

            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("Minimo" + min);
        System.out.println("Maximo" + max);
    }
}
//Encontre o número mínimo e máximo de uma lista sem usar funções prontas.