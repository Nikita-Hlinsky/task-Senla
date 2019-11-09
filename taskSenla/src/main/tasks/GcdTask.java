package main.tasks;

import java.util.Scanner;

public class GcdTask implements tasks.Task {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two nums: ");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Their greatest divisor: " + gcd(a, b));
        System.out.println("Their smallest multiple: " + lcm(a, b));
    }

    @Override
    public void printDescription() {
        System.out.println("Необходимо написать рекурсивный алгоритм для нахождения НОД\n" +
                "и НОК двух чисел.");
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return b != 0 ? gcd(b, a % b) : a;
    }


    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
