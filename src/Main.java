import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numerosAleatorios = new Random();

        int numeroGerado, opcao = -1;
        int[] intervalo = {0, 100};
        do {
            System.out.println("\nMenu de Opções\n0 - Sair\n1 - Jogar\n"
                    .concat("2 - Inserir intervalo manualmente\n"));
            try {
                opcao = scan.nextInt();
                switch (opcao) {
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    case 1:
                        numeroGerado = numerosAleatorios.nextInt(intervalo[1] + 1); // Intervalo até o maior número
                        EntradaDoJogador(scan, numeroGerado);
                        break;
                    case 2:
                        intervalo = IntervaloDoJogador(scan);
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite somente números!");
                scan.next(); //Limpar a entada
            }
        } while (opcao != 0);
        scan.close();
    }

    static void EntradaDoJogador(Scanner scan, int numeroGerado) {
        int contador = 0, numeroDigitado;
        String entrada;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("\nDigite um número ou \"s\" para encerrar a partida: ");
            entrada = scan.next();

            if (entrada.equalsIgnoreCase("s")) { // Condição de parada 's' ou 'S'
                acertou = true;
            } else {
                try {
                    numeroDigitado = Integer.parseInt(entrada); // Convertendo a entrada para int
                    contador++;

                    if (numeroDigitado < numeroGerado) {
                        System.out.println("O número gerado é maior!");
                    } else if (numeroDigitado > numeroGerado) {
                        System.out.println("O número gerado é menor!");
                    } else {
                        System.out.println("Você acertou em " + contador + " tentativas!");
                        acertou = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um numero ou \"s\".");
                }
            }
        }
    }

    static int[] IntervaloDoJogador(Scanner scan) {
        int numeroMenor = -1, numeroMaior;
        int[] intervalo = new int[2];
        boolean definiu = false;

        while (!definiu) {
            try {
                if (numeroMenor < 0) {
                    System.out.print("Digite o menor número do intervalo: ");
                    numeroMenor = scan.nextInt();
                    if (numeroMenor < 0) { // Caso o usuário digite um número negativo
                        System.out.println("\nDigite um número natural!");
                    }
                } else {
                    System.out.print("Digite o maior número do intervalo: ");
                    numeroMaior = scan.nextInt();
                    if (numeroMaior <= numeroMenor) {
                        System.out.println("\nDigite um número maior que: " + numeroMenor);
                    } else {
                        intervalo[0] = numeroMenor;
                        intervalo[1] = numeroMaior;
                        definiu = true;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\nDigite apenas números!");
                scan.next(); // Limpar a entada
            }
        }
        return intervalo;
    }
}