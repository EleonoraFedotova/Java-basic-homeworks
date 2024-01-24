package ru.fedotova.java.basic.homeworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        specNumber();
        sumArray();
        fillArray();
        increasingNumbers();
        sumArrayHalf();
        sumCompareArrays();
        sortArray();
        reverseOrder();
    }

    //1. Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void specNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int inNumber = scanner.nextInt();
        String outStr = "Hello World";
        for (int i = 0; i < inNumber; i++) {
            System.out.println(outStr);
        }
    }

    //2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void sumArray() {
        int[] arr = {1, 8, 5, 3, 1, 1, 7, 2, 1, 2, 6, 9}; //8 + 7 + 6 + 9 = 30
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    // 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void fillArray() {
        int[] arr = new int[10];
        int a = 15;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
         /* ВАРИАНТ 2:
         int[] arr = new int[10];
         for (int i = 0; i < arr.length; i++) {
         arr[i] = 15;
         }     */
        System.out.println(Arrays.toString(arr));
    }

    // 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.
    public static void increasingNumbers() {
        int[] arr = {1, 8, 5, 3, 1, 1, 7, 2, 1, 2, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 15;
        }
        System.out.println(Arrays.toString(arr));
    }

    //5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void sumArrayHalf() {
        int[] arr = {1, 2, 5, 3, 7, 4, 7, 2, 5, 2, 6, 8};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 >= sum2) {
            System.out.println(sum1); // сумма 1 половины = 22
        } else {
            System.out.println(sum2); // сумма 2 половины = 30
        }
    }

    /*  Задание со *
    Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
массив равный сумме входящих;
Пример: { 1, 2, 3 }  + { 2, 2 }  + { 1, 1, 1, 1, 1}
 = { 4, 5, 4, 1, 1 }
*/
    public static void sumCompareArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 2, 4};
        int[] arr3 = new int[Integer.max(arr1.length, arr2.length)];
       int count = 0;
        int j = 0;
        for (int i = 0; i < Integer.min(arr1.length, arr2.length); i++)
            arr3[i] = arr1[i] + arr2[i];
            System.out.println(Arrays.toString(arr3));
    }

    // Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или возрастания (по выбору пользователя)
    public static void sortArray() {
        int[] arr1 = {3, 7, 5, 3, 2, 4, 1, 2, 5, 2, 6, 8};
        Arrays.sort(arr1);
        for (int i = 0, j = arr1.length - 1, sort; i < j; i++, j--) {
            sort = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = sort;
        }

        System.out.println(Arrays.toString(arr1));
    }

    /* Реализуйте метод, “переворачивающий” входящий массив
    Пример: { 1 2 3 4 } => { 4 3 2 1 } */
    public static void reverseOrder() {
        int[] arr = {3, 1, 2, 4, 1, 2, 5, 2, 6, 5};
        for(int i = 0; i < arr.length; i++);
        int a = arr.length;
        for(int i = 0; i < a/2; i++) {
            int reverse = arr[a - i - 1];
            arr[a - i - 1] = arr[i];
            arr[i] = reverse;
        }
        System.out.println(Arrays.toString(arr));
    }

}