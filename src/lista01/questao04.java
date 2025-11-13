package lista01;

public class questao04 {
    public static void main(String[] args) {
        int produto = 1;

        for(int i = 1; i <= 10; ++i) {
            produto *= i;
        }
        System.out.println("produto de 1 até 10: " + produto);
    }
}
//Calcule o produto de todos os números de 1 a 10.