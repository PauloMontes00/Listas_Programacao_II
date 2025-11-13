package lista01;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();
        String invertida = "";

        for(int i = texto.length() - 1; i >= 0; --i) {
            invertida = invertida + texto.charAt(i);
        }
        System.out.println("String invertida: " + invertida);
        sc.close();
    }
}
//Inverta uma string utilizando um laço for