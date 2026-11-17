public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Digite um número: "));
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}