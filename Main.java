import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê um valor numérico do usuário
        System.out.print("Digite um número inteiro: ");
        int valor = scanner.nextInt();

        // Converte o valor para o tipo wrapper Integer
        Integer valorWrapper = Integer.valueOf(valor);

        // Imprime o valor original e o valor convertido
        System.out.println("Valor original (primitivo): " + valor);
        System.out.println("Valor convertido (wrapper): " + valorWrapper);

        // Fecha o scanner
        scanner.close();
    }
}
