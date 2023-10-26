package ru.rusalitc.basic.lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        while (true) {// Добавлен цикл для проверки всех методов домашнего задания
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите число от 1 до 5 для выбора метода");
            System.out.println("1 - Приветствие");
            System.out.println("2 - Определение знака суммы трех чисел");
            System.out.println("3 - Светофор");
            System.out.println("4 - Сравнение двух чисел");
            System.out.println("5 - Сумма или разность");
            System.out.println("0 - Выход");

            int result = scanner.nextInt();
            if (result == 1) {
                greetings();
            }
            if (result == 2) {
                System.out.println("Введите первое число");
                int a = scanner.nextInt();
                System.out.println("Введите второе число");
                int b = scanner.nextInt();
                System.out.println("Введите третье число");
                int c = scanner.nextInt();

                checkSign(a, b, c);
            }
            if (result == 3) {
                selectColor();
            }
            if (result == 4) {
                compareNumbers();
            }
            if (result == 5) {
                System.out.println("Введите первое число");
                int d = scanner.nextInt();
                System.out.println("Введите второе число");
                int e = scanner.nextInt();
                //} Не смог реализовать через диалог, не уверен что можно закидывать boolean как аргумент
                // System.out.println("Сложить эти числа? (1 - да, 2 - нет");
                //int f = scanner.nextInt();
                //boolean increment1;
                // if (f == 1) {
                //    increment1 = true;
                //}
                //if (f == 2) {
                //    increment1 = false;


                addOrSubtractAndPrint(d, e, true);
            }
            if (result == 0) {
                break;
            }

        }
    }

    public static void greetings() { // Метод №1 "Приветсвие"
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a1, int b1, int c1) { // Метод №2 "Определение знака суммы трех чисел"
        int summ = a1 + b1 + c1;
        if (summ >= 0) {
            System.out.println("Сумма чисел положительная");
        } else {
            System.out.println("Сумма чисел отрицательная");
        }
    }

    public static void selectColor() { // Метод №3 "Светофор"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int data = scanner.nextInt();
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() { // Метод №4 "Сравнение двух чисел"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println(a + ">=" + b);
        } else {
            System.out.println(a + "<" + b);
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) { // Метод №5 "Сумма или разность"
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
