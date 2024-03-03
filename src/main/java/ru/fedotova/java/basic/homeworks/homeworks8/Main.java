package ru.fedotova.java.basic.homeworks.homeworks8;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArray(correctArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример вызова с некорректным массивом
        String[][] incorrectArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int result = sumArray(incorrectArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        int rows = 4;
        int cols = 4;

        if (array.length != rows || array[0].length != cols) {
            throw new AppArraySizeException("Некорректный размер массива");
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}
