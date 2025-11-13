package lista01;

import java.util.Arrays;

public class questao34 {
    public static boolean saoAnagramas(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
    }
    public static void main(String[] args) {
        String palavra1 = "amor";
        String palavra2 = "roma";
        String palavra3 = "amora";
        System.out.println(palavra1 + " e " + palavra2 + " são anagramas? " + saoAnagramas(palavra1, palavra2));
        System.out.println(palavra1 + " e " + palavra3 + " são anagramas? " + saoAnagramas(palavra1, palavra3));
    }
}
// Crie um programa que determine se uma palavra é um anagrama de outra.