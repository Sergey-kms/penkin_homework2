package ru.penkin.java.homework2;

import java.util.Scanner;

public class PenkinJavaBasicHomework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Домашнее задание 2, введите номер метода от 1 до 5");
        int scan = scanner.nextInt();
        if (scan == 1) {
            Metod_1(5, "Заработало!");
        }
        if (scan == 2) {
            int[] array = {9, 1, 10, 7, 4, 100, 3, 6};
            Metod_2(array);
        }
        if (scan == 3) {
            System.out.print("Введите число для заполнения массива ");
            int number = scanner.nextInt();
            int[] array = new int[12];
            Metod_3(number, array);
            System.out.println("Массив после заполнения:");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }
        if (scan == 4) {
            System.out.print("Введите число, на которое будет увеличен каждый элемент массива  ");
            int number2 = scanner.nextInt();
            int[] array = {5, 12, 9, 7, 25};
            Metod_4(number2, array);
            System.out.println("Массив после операции увеличения:");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }
        if (scan == 5) {
            int[] array = {10, 30, 15, 20, 35, 70, 80, 100};
            Metod_5(array);
        }
    }

    public static void Metod_1(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void Metod_2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов массива, которые больше 5 равна " + sum);
    }

    public static void Metod_3(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    public static void Metod_4(int number2, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number2;
        }
    }

    public static void Metod_5(int[] array) {
        int length = array.length;
        if (length == 0) {
            System.out.println("Массив пустой");
        }

        int SummaPervoiPoloviny = 0;
        int SummaVtoroyPoloviny = 0;

        if (length % 2 == 0) {
            for (int i = 0; i < length / 2; i++) {
                SummaPervoiPoloviny += array[i];
            }
            for (int i = length / 2; i < length; i++) {
                SummaVtoroyPoloviny += array[i];
            }
        } else {
            for (int i = 0; i < length / 2; i++) {
                SummaPervoiPoloviny += array[i];
            }
            for (int i = length / 2 + 1; i < length; i++) {
                SummaVtoroyPoloviny += array[i];
            }
        }

        if (SummaPervoiPoloviny > SummaVtoroyPoloviny) {
            System.out.println("Сумма элементов первой половины массива больше суммы элементов второй половины массива и эта сумма: " + SummaPervoiPoloviny);
        } else if (SummaVtoroyPoloviny > SummaPervoiPoloviny) {
            System.out.println("Сумма элементов второй половины массива больше суммы элементов первой половины массива и эта сумма: " + SummaVtoroyPoloviny);
        } else {
            System.out.println("Суммы элементов обоих половин массива равны и эта сумма половины массива: " + SummaPervoiPoloviny);
        }
    }
}
