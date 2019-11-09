package main.tasks;

import java.util.Scanner;

public class ReplacementTask implements tasks.Task {

    Scanner in = new Scanner(System.in);

    @Override
    public void run(){
        System.out.println("Enter anything and the programm will delete numbers: ");
        String anything = in.next();
        replacement(anything);
    }

    @Override
    public void printDescription(){
        System.out.println(
                "Необходимо написать программу, которая удаляет из текста числа."
        );
    }

    static void replacement(String word){
        word = word.replaceAll("\\d","");
        System.out.println(word);
    }
}
