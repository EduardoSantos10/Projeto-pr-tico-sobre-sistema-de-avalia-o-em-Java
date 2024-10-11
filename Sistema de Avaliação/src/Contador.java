import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            int contar = parametroUm - parametroDois;
            for (contar = 0; parametroDois > parametroUm; contar--) {
                System.out.println("Error");
            }

        } catch (Error e) {
            System.out.println("Número um tem que ser maior que o número Dois");

        }

        terminal.close();

    }

}
