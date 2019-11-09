package main;

//import com.sun.scenario.effect.GaussianShadow;
import main.tasks.*;

import tasks.Task;

import java.util.*;

public class Core {
    public static void main(String[] args) {

        //Task k = new LineIntersectionTask();
        Task k = new PrimeNumberTask();
        //Task k = new FibonacciTask();
        //Task k = new GcdTask();
        //Task k = new ReplacementTask();
        //Task k = new TaskSix();

        k.printDescription();
        k.run();

//        int  l  = GcdTask.lcm(3,14);
//        System.out.println(l);

//
         //брут генерация простых чисел

//        int fibCount = in.nextInt();
//        rangeFib(fibCoutn); //Фибоначчи

//        System.out.println("Enter 2 lines: ");
//        int a1, a2, b1, b2, c1, c2, d1, d2;
//        a1 = in.nextInt();
//        a2 = in.nextInt();
//        c1 = in.nextInt();
//        c2 = in.nextInt();
//        b1 = in.nextInt();
//        b2 = in.nextInt();
//        d1 = in.nextInt();
//        d2 = in.nextInt();
//        models.Point point1 = new models.Point(a1, a2);
//        models.Point point2 = new models.Point(b1, b2);
//        models.Point point3 = new models.Point(c1, c2);
//        models.Point point4 = new models.Point(d1, d2);
//        CheckIntersection(point1, point2, point3, point4); //первые 4 точки, это первая линия и тд

//        System.out.println("Enter anything and the programm will delete numbers: ");
//        String anything = in.next();
//        replacement(anything);



//        System.out.println("Enter the word and the program will determine if the word is a palindrome");
//        String str = in.next();
//        if (isPalindrome(str)) System.out.println("is palindrome.");
//        else {
//            System.out.println("isnt palindrome.");
//        }

    }
}
