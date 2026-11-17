import java.util.Scanner;

public class Exercicio04 {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int auxiliar = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = auxiliar;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Array antes de ordenar:");
        exibir(numeros);
        System.out.println("Está ordenado? " + estaOrdenado(numeros));

        ordenar(numeros);

        System.out.println("Array depois de ordenar:");
        exibir(numeros);
        System.out.println("Está ordenado? " + estaOrdenado(numeros));

        entrada.close();
    }
}