import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[12];

        System.out.print("Digite o valor do empréstimo: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxa = entrada.nextDouble();

        for (int i = 0; i < valores.length; i++) {
            int mes = i + 1;
            valores[i] = valor + valor * taxa / 100 * mes;
            System.out.printf("Mês %d: R$ %.2f%n", mes, valores[i]);
        }

        entrada.close();
    }
}