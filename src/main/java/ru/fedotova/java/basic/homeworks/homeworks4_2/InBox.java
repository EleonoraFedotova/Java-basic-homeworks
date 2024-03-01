package ru.fedotova.java.basic.homeworks.homeworks4_2;

import ru.fedotova.java.basic.homeworks.homeworks4_2.Box;

public class InBox {
    public static void main(String[] args) {
        Box box = new Box(10, 7, 8, "красный");
        box.inform();
        box.open();
        box.putItem("Книга");
        box.close();
        box.recolor("синий");
        box.open();
        box.awayItem();
        box.inform();
    }
}
