package lista01;

import java.util.Arrays;

public class questao39 {
    public static void main(String[] args) {
        double[] numeros = new double[]{(double)1.0F, (double)3.0F, (double)2.0F, (double)5.0F, (double)4.0F};
        double mediana = calcularMediana(numeros);
        System.out.println("O vetor é: " + Arrays.toString(numeros));
        System.out.println("A mediana é: " + mediana);
    }
    public static double calcularMediana(double[] vetor) {
        Arrays.sort(vetor);
        int tamanho = vetor.length;
        if (tamanho % 2 == 1) {
            return vetor[tamanho / 2];
        } else {
            double elementoMeio1 = vetor[tamanho / 2 - 1];
            double elementoMeio2 = vetor[tamanho / 2];
            return (elementoMeio1 + elementoMeio2) / (double)2.0F;
        }
    }
}
//Crie um programa que calcule a mediana de um vetor.