package com.company;
import java.util.*;


public class Main {

    private static boolean value;

    public static void main(String[] args) {


        int n1;
        int n2;
        boolean Flag;
        int otvet;



        char op;

        Scanner sc = new Scanner(System.in);

        System.out.print("Эки сан жазыныз");



        n1 = sc.nextInt();
        someMethod(n1);
        someMethod2(n1);

        n2 = sc.nextInt();
        someMethod(n2);
        someMethod2(n2);







        System.out.print("\nОперацияны танданыз (+, -, *, /): ");
        op = sc.next().charAt(0);


        switch (op) {
            case '+':
                otvet = n1 + n2;

                break;
            case '-':
                otvet = n1 - n2;

                break;
            case '*':
                otvet = n1 * n2;

                break;
            case '/':
                otvet = n1 / n2;


                break;
            default:
                System.out.printf("Error!");
                return;
            }



        System.out.print("\nЖооп\n");
        System.out.print(n1 + " " + op + " " + n2 + " = " + otvet);


        System.out.println("\nКалькуоятор катасыз ищтеди\n");
    }


    public static void someMethod ( int a){
        if (a > 10) {
            throw new Error("Ондонашып калды");
        }
    }

    public static void someMethod2 ( int i){
        if (i > 10) {
            throw new Error("Ондонашып калды");

        }}}