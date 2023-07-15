import java.util.Scanner;

public class TrocoNotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor float
        String input = scanner.next();
        double valor = Double.parseDouble(input.replace(',', '.'));

        // Arrays com os valores das notas e moedas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        // Imprimindo a mensagem inicial
        System.out.println("NOTAS:");

        // Calculando e exibindo as notas
        for (int nota : notas) {
            int quantidade = (int) (valor / nota);
            valor %= nota;
            System.out.println(quantidade + " nota(s) de R$ " + String.format("%.2f", nota / 100.0));
        }

        // Imprimindo a mensagem para as moedas
        System.out.println("MOEDAS:");

        // Multiplicando por 100 para trabalhar com os centavos
        valor *= 100;

        // Calculando e exibindo as moedas
        for (int moeda : moedas) {
            int quantidade = (int) (valor / moeda);
            valor %= moeda;
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda / 100.0));
        }
    }
}
