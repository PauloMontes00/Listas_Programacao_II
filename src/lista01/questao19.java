package lista01;

import java.util.Random;

public class questao19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] contagem = new int[6];

        for(int i = 0; i < 100; ++i) {
            int resultado = random.nextInt(6);
            int var10002 = contagem[resultado]++;
        }
        for(int i = 0; i < contagem.length; ++i) {
            System.out.println("Número" + (i + 1) + ":" + contagem[i] + "vezes");
        }
    }
}
//Simule o lançamento de um dado 100 vezes e conte quantas vezes cada número saiu.