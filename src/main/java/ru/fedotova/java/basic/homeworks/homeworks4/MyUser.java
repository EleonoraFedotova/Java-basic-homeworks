package ru.fedotova.java.basic.homeworks.homeworks4;
import ru.fedotova.java.basic.homeworks.homeworks4.User;
public class MyUser {
    public static void main(String [] args) {
        User [] users = {
                new User("Иванов", "Иван", "Иванович", 1945, "ivan@mail.ru"),
                new User("Иванова", "Ольга", "Ивановна", 1996, "ivanova@mail.ru"),
                new User("Смирнов", "Тимофей", "Тимофеевич", 1976, "mirnov12@mail.ru"),
                new User("Рябова", "Анна", "Романовна", 1958, "12345@ya.ru"),
                new User("Романов", "Дмитрий", "Ярославович", 1994, "5866797@mail.ru"),
                new User("Романов", "Сергей", "Ярославович", 1977, "romanov77@mail.ru"),
                new User("Кочеткова", "Милана", "Матвеевна", 1997, "rgierhguif@ya.ru"),
                new User("Шубина", "Теона", "Владиславовна", 1964, "1223eretr@ya.ru"),
                new User("Козлов", " Роман", "Артёмович", 1981, "kozlov1981@mail.ru"),
                new User("Козловa", "Ольга", "Владимировна", 1989, "kozlova1989@mail.ru"),
        };
        for (int i=0; i < users.length; i++)
            if (users[i].getYearbirth() <= 2024-40) {
                users[i].info();
            }
    }
}
