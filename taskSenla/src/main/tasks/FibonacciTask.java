package main.tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Task #1
public class FibonacciTask implements tasks.Task {

    private static int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static void rangeFib(int n) {
        int index = 1;
        int curr = fibonacci(index);

        while (curr <= n) {
            System.out.print(curr + " ");
            curr = fibonacci(++index);
        }
    }

    @Override
    public void run() {
        System.out.println("Enter num: ");
        int fibCount = new Scanner(System.in).nextInt();
        rangeFib(fibCount); //Фибоначчи
    }

    @Override
    public void printDescription() {
        System.out.println("Необходимо написать рекурсивный алгоритм, который находит\n" +
                "числа Фибоначчи в пределах от 1 до N.");
    }
}
