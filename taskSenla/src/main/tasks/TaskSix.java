package tasks;


import java.util.Scanner;

/*
 *
 *
 * */
public class TaskSix implements Task {

    @Override
    public void run() {
        System.out.println("Enter the word and the program will determine if the word is a palindrome");
        String str = new Scanner(System.in).next();

        if (isPalindrome(str)) {
            System.out.println("is palindrome.");
        } else {
            System.out.println("isnt palindrome.");
        }
    }

    @Override
    public void printDescription() {

    }

    private static boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0; i < (n / 2); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
