import java.util.Scanner;

public class Exercicio06 {
    public static int contarVogais(String texto) {
        int quantidade = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u'
                    || letra == 'á' || letra == 'é' || letra == 'í'
                    || letra == 'ó' || letra == 'ú'
                    || letra == 'â' || letra == 'ê' || letra == 'ô'
                    || letra == 'ã' || letra == 'õ') {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        int maiorQuantidade = -1;
        String fraseComMaisVogais = "";

        for (int i = 0; i < frases.length; i++) {
            int quantidade = contarVogais(frases[i]);
            System.out.println(frases[i] + " - " + quantidade + " vogais");

            if (quantidade > maiorQuantidade) {
                maiorQuantidade = quantidade;
                fraseComMaisVogais = frases[i];
            }
        }

        System.out.println("Frase com mais vogais: " + fraseComMaisVogais);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = entrada.nextLine();
        }

        exibirContagem(frases);

        entrada.close();
    }
}