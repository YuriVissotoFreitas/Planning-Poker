import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class EscolhaFibonacci {
        public static class SequenciaFibonacci {
            public static class Main {
                public static class Fibonacci {
                    private static final List<Integer> FIBONACCI_SEQUENCE = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);

                    public static void main(String[] args) {

                        Scanner scanner = new Scanner(System.in);

                        System.out.println("Quantas pessoas vão participar?");
                        int quantidadePessoas = scanner.nextInt();

                        List<Integer> escolhas = new ArrayList<>();

                        boolean consenso = false;

                        while (!consenso) {

                            escolhas.clear();
                            System.out.println("\nEscolha um número que faça parte da sequência fibonacci");


                            for (int i = 1; i <= quantidadePessoas; i++) {
                                System.out.println("Pessoa " + i + ", insira o número para calcular o Fibonacci:");
                                int escolha = scanner.nextInt();
                                while (!FIBONACCI_SEQUENCE.contains(escolha)) {
                                    System.out.println(
                                            "Número inválido! Este número não faz parte da sequência de fibonacci");
                                    System.out.println("Pessoa" + i + "escolha seu número: ");
                                    escolha = scanner.nextInt();
                                }

                                escolhas.add(escolha);
                            }

                            if (verificarConsenso(escolhas)) {
                                consenso = true;
                                System.out.println("\nTodos chegaram em um consenso!");
                            } else
                                System.out.println("\nNão ouve um consenso. Vamos tentar novamente");
                        }
                        scanner.close();
                    }

                    private static boolean verificarConsenso(List<Integer> escolhas) {
                        int primeiroValor = escolhas.getFirst();
                        for (int escolha : escolhas) {
                            if (escolha != primeiroValor) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
    }