package ru.fedotova.java.basic.homeworks.homeworks3;

public class lesson3Homeworks3 {
    public static void main(String[] args) {
        int arr_sum[][] = {{1, -2, 8}, {3, -7, 0, 4}};
        System.out.println("Решение задания 1: " + sumOfPositiveElements(arr_sum));
        int size [][] = new int [4][4];
        System.out.println("Решение задания 2: ");
        sumOfLengthSquare(size);
        System.out.println("Решение задания 3: ");
        int arr[][] = new int[3][3];
        zeroDiagonalArray(arr);
        int array[][] = {{1, 4, 8}, {3, 9, 2, 45}};
        System.out.println("Решение задания 4: " + findMax(array));
        int array_sum[][] = {{1, -2, 8}, {5, 1, 1}, {3, 2, 4}};
        System.out.println("Решение задания 5: " + sumTwoRow(array_sum));
 }

    /* 1. Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;*/
    public static int sumOfPositiveElements(int[][] arr_sum) {
        int sum = 0;
        for (int i = 0; i < arr_sum.length; i++) {
            for (int j = 0; j < arr_sum[i].length; j++) {
                if (arr_sum[i][j] > 0) {
                    sum += arr_sum[i][j];
                }
            }
        }
        return sum;
    }
    // 2. Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;

    public static void sumOfLengthSquare(int[][] size) {
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                char [][] sizeIn = new char[size[i].length][size[j].length];
                if (((i == 0) || (j == 0) || i == (size.length - 1) || (j == size[0].length-1))) {
                    sizeIn [i][j] = '*';
                }
                System.out.print(sizeIn[i][j] + " ");
            } System.out.println();
        }
        return;
    }
        /* 3. Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе); */
        public static int zeroDiagonalArray (int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = 1;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        arr[i][j] = 0;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            return 0;
        }
        // 4. Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

        public static int findMax ( int[][] array){
            int max = array[0][0];
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    {
                        if (array[i][j] > max) {
                            max = array[i][j];
                        }
                    }
                }
            }
            return max;
        }
    /* 5. Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,
    то в качестве результата необходимо вернуть -1 */
        public static int sumTwoRow (int[][] array_sum){
            int sum = 0;
            for (int i = 1; i < array_sum.length; i++) {
                for (int j = 0; j < array_sum[i].length; j++)
                    if (i == 1) {
                        sum += array_sum[i][j];
                    }
                if (i == 0){
                    sum = -1;
                }
            }
            return sum;
        }
    }

