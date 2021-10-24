package lesson3.homework.printable;


import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.

        ArrayList<Printable> printableList = new ArrayList<>();
        Book book = new Book();
        Magazine magazine = new Magazine();

        printableList.add(book);
        printableList.add(magazine);

        System.out.println(printableList);
    }
}
