package lista01;

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe qual tabuada deve ser impressa:\n>");
        int tabuada = sc.nextInt();

        for(int x = 1; x <= 10; ++x) {
            int resultado = tabuada * x;
            System.out.println(tabuada + "X" + x + "=" + resultado);
        }
        sc.close();
    }
}
//Imprima a tabuada de um número escolhido pelo usuário.