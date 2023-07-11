package ru.otus.lesson3;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5");
        int result = scanner.nextInt();
        if (result == 1) {
            greetings();
        } else if (result == 2) {
            checkSign((int) (Math.random() * 10 - Math.random() * 100), (int) (Math.random() * 10 + Math.random() * 100), (int) (Math.random() * 10));
        } else if (result == 3) {
            selectColor();
        } else if (result == 4) {
            compareNumbers();
        } else if (result == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 10), (int) (Math.random() * 10), Math.random() >= 0.5);
        } else {
            System.out.println("Введенно некорректное число");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nworld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 100 * Math.pow(Math.random() / 10, Math.random()));
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
