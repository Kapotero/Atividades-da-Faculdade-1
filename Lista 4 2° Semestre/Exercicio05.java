import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] precos = new double[5];
        double[] precosComDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = entrada.nextDouble();
            precosComDesconto[i] = precos[i] - (precos[i] * 0.10);
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d - Original: R$ %.2f | Com desconto: R$ %.2f%n",
                    i + 1, precos[i], precosComDesconto[i]);
        }

        entrada.close();
    }
}