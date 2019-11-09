package main.tasks;

import tasks.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class PrimeNumberTask implements tasks.Task {
    Scanner in = new Scanner(System.in);

    static List<Integer> primeNumbersBruteForce(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void run(){
        System.out.println("Enter num: ");
        int num = in.nextInt();
        System.out.println(primeNumbersBruteForce(num));
    }

    @Override
    public void printDescription(){
        System.out.println("Необходимо написать программу, которая вычисляет простые\n" +
                "числа в пределах от 1 до N.");
    }

}
