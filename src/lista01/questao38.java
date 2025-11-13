package lista01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class questao38 {
    public static List<Integer> encontrarInterseccao(int[] vetor1, int[] vetor2) {
        Set<Integer> set1 = new HashSet();

        for(int elemento : vetor1) {
            set1.add(elemento);
        }
        List<Integer> interseccao = new ArrayList();

        for(int elemento : vetor2) {
            if (set1.contains(elemento)) {
                interseccao.add(elemento);
            }
        }
        return interseccao;
    }
    public static void main(String[] args) {
        int[] vetorA = new int[]{1, 2, 3, 4, 5};
        int[] vetorB = new int[]{4, 5, 6, 7, 8};
        List<Integer> resultado = encontrarInterseccao(vetorA, vetorB);
        System.out.println("Intersecção dos vetores: " + String.valueOf(resultado));
    }
}
//Implemente um programa que encontre a interseção entre dois vetores.