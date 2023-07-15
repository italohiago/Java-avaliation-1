import java.util.Scanner;

public class OrdenacaoParesImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        int numPares = 0;
        int numImpares = 0;

        //Ler numero de entradas
        int numEntradas = scanner.nextInt();

        //Criar vetores com numero de entradas
        int[] pares = new int[numEntradas];
        int[] impares = new int[numEntradas];

        //Ler entradas e colocar no vetor
        for (int i = 0; i < numEntradas; i++) {
            entrada = scanner.nextInt();
            if (entrada % 2 == 0) {
                pares[numPares] = entrada;
                numPares++;
            } else {
                impares[numImpares] = entrada;
                numImpares++;
            }
        }

        // Ordenar pares em ordem crescente (Bubble Sort)
        for (int i = 0; i < numPares - 1; i++) {
            for (int j = 0; j < numPares - i - 1; j++) {
                if (pares[j] > pares[j + 1]) {
                    int aux = pares[j];
                    pares[j] = pares[j + 1];
                    pares[j + 1] = aux;
                }
            }
        }

        // Ordenar ímpares em ordem decrescente (Bubble Sort)
        for (int i = 0; i < numImpares - 1; i++) {
            for (int j = 0; j < numImpares - i - 1; j++) {
                if (impares[j] < impares[j + 1]) {
                    int aux = impares[j];
                    impares[j] = impares[j + 1];
                    impares[j + 1] = aux;
                }
            }
        }

        // Imprimir os números pares ordenados
        for (int i = 0; i < numPares; i++) {
            System.out.println(pares[i]);
        }

        // Imprimir os números ímpares ordenados
        for (int i = 0; i < numImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}