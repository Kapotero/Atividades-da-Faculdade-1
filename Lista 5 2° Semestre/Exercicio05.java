import java.util.Scanner;

public class Exercicio05 {
    public static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }

        String binario = "";

        while (n > 0) {
            int resto = n % 2;
            binario = resto + binario;
            n = n / 2;
        }

        return binario;
    }

    public static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número inteiro não negativo: ");
            numeros[i] = entrada.nextInt();

            while (numeros[i] < 0) {
                System.out.print("Digite um número não negativo: ");
                numeros[i] = entrada.nextInt();
            }
        }

        exibirTabela(numeros);

        entrada.close();
    }
}