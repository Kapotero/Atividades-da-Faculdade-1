public class Exercicio05 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(IO.readln("Digite um número: "));
            }
        }

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
    }
}