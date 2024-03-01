package ru.fedotova.java.basic.homeworks.homeworks4_2;

public class Box {
    //* Попробуйте реализовать класс по его описаниям: объекты класса Коробка должны иметь размеры и цвет.
    // Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
    // У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет (если в ней нет предмета),
    // или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
    // Выполнение методов должно сопровождаться выводом сообщений в консоль.
    private final int width;
    private final int height;
    private final int depth;
    private String colour;
    private boolean openBox;
    private String object;

    public Box (int width, int height, int depth, String colour) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.colour = colour;
        this.openBox = false;
        this.object = null;
    }

    public void open() {
        openBox = true;
        System.out.println("Коробка открыта.");
    }

    public void close() {
        openBox = false;
        System.out.println("Коробка закрыта.");
    }

    public void recolor(String newColour) {
        colour = newColour;
        System.out.println("Коробка перекрашена в цвет: " + newColour);
    }

    public void putItem(String предмет) {
        if (openBox && this.object == null) {
            this.object = предмет;
            System.out.println("Предмет положен в коробку: " + object);
        } else {
            System.out.println("Невозможно положить предмет. Коробка закрыта или в ней уже есть предмет.");
        }
    }

    public void awayItem() {
        if (openBox && object != null) {
            System.out.println("Предмет выкинут из коробки: " + object);
            object = null;
        } else {
            System.out.println("Невозможно выкинуть предмет. Коробка закрыта или в ней нет предмета.");
        }
    }

    public void inform() {
        System.out.println("Информация о коробке:");
        System.out.println("Размеры: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет: " + colour);
        System.out.println("Состояние: " + (openBox ? "открыта" : "закрыта"));
        System.out.println("Предмет: " + (object != null ? object : "нет"));
    }
}

