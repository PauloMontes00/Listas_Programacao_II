package lista01;

public class questao33 {
    public static void main(String[] args) {
        int numLinhas = 5;
        int numero = 1;

        for(int i = 1; i <= numLinhas; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(numero + " ");
                ++numero;
            }
            System.out.println();
        }
    }
}
//Construa uma pirâmide numérica onde cada linha contém números consecutivos.