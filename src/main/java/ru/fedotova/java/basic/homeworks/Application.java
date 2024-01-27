package ru.fedotova.java.basic.homeworks;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Простые задания, без *");
        specNumber(1, "Hello World");
        sumArray(new int[] {1, 8, 5, 3, 1, 1, 7, 2, 1, 2, 6, 7});
        fillArray(15, new int[5]);
        increasingNumbers(15, new int[]{1, 8, 5, 3, 1, 1, 7, 2, 1, 2, 6, 8});
        sumArrayHalf(new int[] {1, 2, 5, 3, 7, 4, 7, 2, 5, 2, 6, 8});
        System.out.println("Задания со *");
        sortArray();
        reverseOrder();
    }

    //1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void specNumber(int inNumber, String outStr) {
            for (int i = 0; i < inNumber; i++) {
            System.out.println("Решение задания 1: " + outStr);
        }
    }

    //2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Решение задания 2: " + sum);
    }

    // 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void fillArray(int a, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
         /* ВАРИАНТ 2:
         for (int i = 0; i < arr.length; i++) {
         arr[i] = 15;
         }     */
        System.out.print("Решение задания 3: ");
        System.out.println(Arrays.toString(arr));
    }

    // 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.
    public static void increasingNumbers(int inNum, int[] arr) {
        //int[] arr = {1, 8, 5, 3, 1, 1, 7, 2, 1, 2, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += inNum;
        }
        System.out.print("Решение задания 4: ");
        System.out.println(Arrays.toString(arr));
    }

    //5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void sumArrayHalf(int[] arr) {
        //int[] arr = {1, 2, 5, 3, 7, 4, 7, 2, 5, 2, 6, 8};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 >= sum2) {
            System.out.println("Решение задания 5: " + sum1); // сумма 1 половины = 22
        } else {
            System.out.println("Решение задания 5: " + sum2); // сумма 2 половины = 30
        }
    }

    /*  Задание со *
    6. Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
массив равный сумме входящих;
Пример: { 1, 2, 3 }  + { 2, 2 }  + { 1, 1, 1, 1, 1}
 = { 4, 5, 4, 1, 1 }
*/
// !НУЖЕН ПРИМЕР КОДА ИЗ 3-4 массивов!
    // 7. Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или возрастания (по выбору пользователя)
    public static void sortArray () {
        int[] array = {1,2,3,5,5,6,7,8,8,10};

        boolean sorted= true;
        System.out.print("Решение задания 7:\nЗадан массив: " + Arrays.toString(array));

        if (array[0] <= array[1]) {
            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                    break;
                }
            }
           if (sorted) {
                System.out.println(". Массив отсортирован по возрастанию");
            }
            else {
                System.out.println(". Ошибка: массив не отсортирован");
            }
        }
        else {
            System.out.println(". Массив отсортирован по убыванию");
            for (int i = 2; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    sorted = false;
                    break;
                }
            }
           if (sorted) {
                System.out.println(". Массив отсортирован по убыванию");
            }
            else {
                System.out.println(". Ошибка: массив не отсортирован");
            }
        }
    }

    /* 8. Реализуйте метод, “переворачивающий” входящий массив
    Пример: { 1 2 3 4 } => { 4 3 2 1 } */
    public static void reverseOrder() {
        int[] arr = {3, 1, 2, 4, 1, 2, 5, 2, 6, 5};
        System.out.println("Решение задания 8:\nЗадан массив: " + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++);
        int a = arr.length;
        for(int i = 0; i < a/2; i++) {
            int reverse = arr[a - i - 1];
            arr[a - i - 1] = arr[i];
            arr[i] = reverse;
        }
        System.out.println("Метод, “переворачивающий” массив: " + Arrays.toString(arr));
    }
}