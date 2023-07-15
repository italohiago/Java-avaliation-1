import java.util.Scanner;

public class NumeroDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do array e do valor alvo
        int numEntradas = scanner.nextInt();
        int alvo = scanner.nextInt();

        // Leitura do array de inteiros
        int[] inteiros = new int[numEntradas];
        for (int i = 0; i < numEntradas; i++) {
            inteiros[i] = scanner.nextInt();
        }

        // Contagem do número de pares que a diferença é igual ao valor alvo
        int paresCorretos = 0;
        for (int i = 0; i < numEntradas; i++) {
            for (int j = i + 1; j < numEntradas; j++) {
                int diferenca = inteiros[j] - inteiros[i];
                if (diferenca == alvo || diferenca == -alvo) {
                    paresCorretos++;
                }
            }
        }

        System.out.println(paresCorretos);
    }
}