import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}