import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int n = entrada.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida");
            entrada.close();
            return;
        }

        double[] precos = new double[n];
        int[] quantidades = new int[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o preço unitário do item " + (i + 1) + ": ");
            precos[i] = entrada.nextDouble();

            System.out.print("Digite a quantidade do item " + (i + 1) + ": ");
            quantidades[i] = entrada.nextInt();

            double subtotal = precos[i] * quantidades[i];
            total += subtotal;

            System.out.printf("Subtotal do item %d: R$ %.2f%n", i + 1, subtotal);
        }

        double desconto = 0;

        if (total > 200) {
            desconto = total * 0.05;
        }

        double valorFinal = total - desconto;

        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}