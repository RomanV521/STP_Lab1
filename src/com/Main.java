package com;

import java.util.Random;
import java.util.Scanner;

/**
 *  Vykhodets Roman, #1
 */

public class Main {
    private static void Start(){
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    /**
     * Дано натуральное число n. Вычислить S=1-(1/2)+(1/4)-...+(-1)^n*(1/2^n).
     */
    private static void task25(){
        System.out.println("Task 25:\nДано натуральное число n. Вычислить S=1-(1/2)+(1/4)-...+(-1)^n*(1/2^n).");
        Random random = new Random();

        double sum=0;
        int number;

        number = random.nextInt(10); //random number(0..9)
        System.out.println("\nn:"+number);

        for(int i=0; i<number; i++){
            sum=sum+Math.pow(-1,i)*(1/Math.pow((2),i));
        }

        System.out.println("\nAnswer: "+sum);
    }

    /**
     * Найти:
     *  а) сумму кубов всех целых чисел от 20 до 40;
     *  б) сумму кубов всех целых чисел от а до 50 (значение а вводится с клавиатуры; 0 ≤ a ≤ 50);
     *  в) сумму кубов всех целых чисел от 1 до n (значение n вводится с клавиатуры; 1 ≤ n ≤ 100);
     *  г) сумму кубов всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).
     */
    private static void task50(){
        System.out.println("\nTask 50:\nНайти:\n"+
                "\tа) сумму кубов всех целых чисел от 20 до 40;\n"+
                "\tб) сумму кубов всех целых чисел от а до 50 (значение а вводится с клавиатуры; 0 ≤ a ≤ 50);\n"+
                "\tв) сумму кубов всех целых чисел от 1 до n (значение n вводится с клавиатуры; 1 ≤ n ≤ 100);\n"+
                "\tг) сумму кубов всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nA)");
        double sum=0;

        for(int i=20; i<=40; i++){
            sum=sum+Math.pow(i,3);
        }
        System.out.println("Answer: "+sum);


        System.out.println("\nБ)");
        sum=0;
        int a;

        do {
            System.out.print("Enter A range(0,50): ");
            a = scanner.nextInt();
        }
        while(a<0||a>50);

        while (a<=50){
            sum=sum+Math.pow(a,3);
            a++;
        }
        System.out.println("\nAnswer: "+sum);


        System.out.println("\nВ)");
        sum=0;
        int n;

        do {
            System.out.print("Enter N range(1,100): ");
            n = scanner.nextInt();
        }
        while(n<1||n>100);

        while (n<=100){
            sum=sum+Math.pow(n,3);
            n++;
        }
        System.out.println("\nAnswer: "+sum);


        System.out.println("\nГ)");
        sum=0;
        a=0;
        int b=0;

        do {
            System.out.print("\nB>=A\nEnter A: ");
            a = scanner.nextInt();
            System.out.print("Enter B: ");
            b = scanner.nextInt();

        }
        while(a>b);

        while (a<=b){
            sum=sum+Math.pow(a,3);
            a++;
        }
        System.out.println("\nAnswer: "+sum);

    }

    /**
     * Вычислить сумму: √(1+√(1+√(3+...+√(50))))..
     */
    private static void task75(){
        System.out.println("\n\nTask 75:");
    }


    public static void main(String[] args) {
	    Start();
        task25();
        task50();
    }
}
