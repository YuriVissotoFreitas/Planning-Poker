import java.util.Scanner;

    public class EscolhaFibonacci {

        static class SequenciaFibonacci {

            public static class Main {

                public static class Fibonacci {
                    public static void main(String[] args) {
                        System.out.println("_".repeat(30));

                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Insira um número não negativo para verificar a sequência de Fibonacci: ");
                        int n = scanner.nextInt();

                        if (n < 0) {
                            System.out.println("Por favor, insira um número não negativo.");
                        } else {
                            if (isFibonacci(n)) {
                                System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
                                System.out.println("~".repeat(30));
                                printFibonacciSequence(n);
                            } else {
                                System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
                            }
                        }

                        scanner.close();
                    }

                    public static boolean isFibonacci(int num) {
                        int a = 0, b = 1;
                        if (num == a || num == b) {
                            return true;
                        }

                        int fib = a + b;
                        while (fib <= num) {
                            if (fib == num) {
                                return true;
                            }
                            a = b;
                            b = fib;
                            fib = a + b;
                        }
                        return false;
                    }

                    public static void printFibonacciSequence(int n) {
                        int t1 = 0, t2 = 1;
                        System.out.print(t1);

                        if (n > 0) {
                            System.out.print(" -> " + t2);
                        }

                        while (true) {
                            int t3 = t1 + t2;
                            if (t3 > n) {
                                break;
                            }
                            System.out.print(" -> " + t3);
                            t1 = t2;
                            t2 = t3;
                        }
                        System.out.println();
                    }
                }
            }

        }

    }

