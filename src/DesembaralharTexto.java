import java.util.Scanner;

public class DesembaralharTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler numero de entradas
        int numEntradas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo int

        for (int i = 0; i < numEntradas; i++) {
            //Ler proxima frase
            String frase = scanner.nextLine();

            //Quebra da frase em 2 partes
            int meio = frase.length() / 2;
            String parteEsquerda = frase.substring(0, meio);
            String parteDireita = frase.substring(meio);

            String resultado = new String();

            //Preencher esquerda
            for (int j = meio - 1; j >= 0; j--) {
                char novoCaractere = parteEsquerda.charAt(j);
                resultado = resultado + novoCaractere;
            }

            //Preencher direita
            for (int j = parteDireita.length() - 1; j >= 0; j--) {
                char novoCaractere = parteDireita.charAt(j);
                resultado = resultado + novoCaractere;
            }

            //Saída
            System.out.println(resultado);
        }
    }
}