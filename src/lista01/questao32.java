package lista01;

public class questao32 {
    public static String cifrar(String texto, int offset) {
        StringBuilder textoCifrado = new StringBuilder();
        offset %= 26;
        if (offset < 0) {
            offset += 26;
        }
        char[] var6;
        for(char caractere : var6 = texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = (char)(Character.isLowerCase(caractere) ? 97 : 65);
                int posicaoOriginal = caractere - base;
                int novaPosicao = (posicaoOriginal + offset) % 26;
                char caractereCifrado = (char)(base + novaPosicao);
                textoCifrado.append(caractereCifrado);
            } else {
                textoCifrado.append(caractere);
            }
        }
        return textoCifrado.toString();
    }
    public static String decifrar(String textoCifrado, int offset) {
        return cifrar(textoCifrado, -offset);
    }

    public static void main(String[] args) {
        String textoOriginal = "Ola Mundo!";
        int chave = 3;
        String textoCifrado = cifrar(textoOriginal, chave);
        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Texto Cifrado: " + textoCifrado);
        String textoDecifrado = decifrar(textoCifrado, chave);
        System.out.println("Texto Decifrado: " + textoDecifrado);
    }
}
// Implemente um algoritmo de criptografia simples que rotaciona as letras do alfabeto.