package ru.fedotova.java.basic.homeworks.homeworks1;


public class MainApplication {
    public static void main (String [] args) {
        greetings();
        checkSign(1, 2, -8);
        selectColor(20);
        compareNumbers(1,3);
        addOrSubtractAndPrint(2, 2, false);
    }
        public static void greetings() {
            System.out.println("Hello\nWorld\nfrom\nJava");
        }
    /*2. Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”; */
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    /*3. Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”; */
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data<=20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    /*4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    /*5.  Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true, то метод должен к initValue прибавить delta
    и отпечатать в консоль результат, в противном случае - вычесть;
    Каждый метод последовательно вызовите из метода main();*/
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        int result1;
        if (increment) {
            result1 = initValue + delta;
        } else {
            result1 = initValue - delta;
        }
        System.out.println(result1);
    }
    //(*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод, соответствующий указанному номеру со случайным значением аргументов;

}


