import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.print("Digite o código do produto: ");
        int codigoInformado = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoInformado) {
                System.out.printf("Preço do produto: R$ %.2f%n", precos[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não foi encontrado");
        }

        entrada.close();
    }
}