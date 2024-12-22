import java.util.Scanner;

    public class EscolhaFibonacci {
        static class SequenciaFibonacci {
            static class Main {
                 static class Fibonacci {
                     public static void main(String[] args) {

                            System.out.println("_".repeat(30));

                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Quantas pessoas vão participar?");
                            int quantidadePessoas = scanner.nextInt();

                            for (int i = 1; i <= quantidadePessoas; i++) {
                                System.out.println("Pessoa " + i + ", insira o número para calcular o Fibonacci:");
                                int n = scanner.nextInt();
                                System.out.println("Fibonacci de " + n + " (Iterativo): " + fibonacciIterativo(n));
                                System.out.println("Fibonacci de " + n + " (Recursivo): " + fibonacciRecursivo(n));
                                System.out.println();
                            }

                            scanner.close();
                        }

                        public static int fibonacciIterativo(int n) {
                            if (n == 0) return 0;
                            if (n == 1) return 1;

                            int a = 0, b = 1;
                            for (int i = 2; i <= n; i++) {
                                int temp = a + b;
                                a = b;
                                b = temp;
                            }
                            return b;
                        }

                        public static int fibonacciRecursivo(int n) {
                            if (n == 0) return 0;
                            if (n == 1) return 1;
                            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
                        }


                    }
                }
            }
        }

