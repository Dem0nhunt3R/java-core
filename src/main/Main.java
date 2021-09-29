package main;

import main.animal.Animal;
import main.book.Book;
import main.client.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();

        Animal animal1 = new Animal("animal1", 1, "dog1");
        animals.add(animal1);
        Animal animal2 = new Animal("animal2", 2, "dog2");
        animals.add(animal2);
        Animal animal3 = new Animal("animal3", 3, "dog3");
        animals.add(animal3);
        Animal animal4 = new Animal("animal4", 4, "dog4");
        animals.add(animal4);
        Animal animal5 = new Animal("animal5", 5, "dog5");
        animals.add(animal5);
        Animal animal6 = new Animal("animal6", 6, "dog6");
        animals.add(animal6);
        Animal animal7 = new Animal("animal7", 7, "dog7");
        animals.add(animal7);
        Animal animal8 = new Animal("animal8", 8, "dog8");
        animals.add(animal8);
        Animal animal9 = new Animal("animal9", 9, "dog9");
        animals.add(animal9);
        Animal animal10 = new Animal("animal10", 10, "dog10");
        animals.add(animal10);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        Book book1 = new Book("book1", 1, "genre1", "date1");
        books.add(book1);
        Book book2 = new Book("book2", 2, "genre2", "date2");
        books.add(book2);
        Book book3 = new Book("book3", 3, "genre3", "date3");
        books.add(book3);
        Book book4 = new Book("book4", 4, "genre4", "date4");
        books.add(book4);
        Book book5 = new Book("book5", 5, "genre5", "date5");
        books.add(book5);
        Book book6 = new Book("book6", 6, "genre6", "date6");
        books.add(book6);
        Book book7 = new Book("book7", 7, "genre7", "date7");
        books.add(book7);
        Book book8 = new Book("book8", 8, "genre8", "date8");
        books.add(book8);
        Book book9 = new Book("book9", 9, "genre9", "date9");
        books.add(book9);
        Book book10 = new Book("book10", 10, "genre10", "date10");
        books.add(book10);

        for (Book book : books) {
            System.out.println(book.toString());
        }
        ArrayList<String> orders1 = new ArrayList<>();
        orders1.add("order1");
        Client client1 = new Client(1, "1", "1", 1, "1", orders1);
        clients.add(client1);

        ArrayList<String> orders2 = new ArrayList<>();
        orders2.add("order2");
        Client client2 = new Client(2, "2", "2", 2, "2", orders2);
        clients.add(client2);

        ArrayList<String> orders3 = new ArrayList<>();
        orders3.add("order3");
        Client client3 = new Client(3, "3", "3", 3, "3", orders3);
        clients.add(client3);

        ArrayList<String> orders4 = new ArrayList<>();
        orders4.add("order4");
        Client client4 = new Client(4, "4", "4", 4, "4", orders4);
        clients.add(client4);

        ArrayList<String> orders5 = new ArrayList<>();
        orders5.add("order5");
        Client client5 = new Client(5, "5", "5", 5, "5", orders5);
        clients.add(client5);

        ArrayList<String> orders6 = new ArrayList<>();
        orders6.add("order6");
        Client client6 = new Client(6, "6", "6", 6, "6", orders6);
        clients.add(client6);

        ArrayList<String> orders7 = new ArrayList<>();
        orders7.add("order7");
        Client client7 = new Client(7, "7", "7", 7, "7", orders7);
        clients.add(client7);

        ArrayList<String> orders8 = new ArrayList<>();
        orders8.add("order8");
        Client client8 = new Client(8, "8", "8", 8, "8", orders8);
        clients.add(client8);

        ArrayList<String> orders9 = new ArrayList<>();
        orders9.add("order9");
        Client client9 = new Client(9, "9", "9", 9, "9", orders9);
        clients.add(client9);

        ArrayList<String> orders10 = new ArrayList<>();
        orders10.add("order10");
        Client client10 = new Client(10, "10", "10", 10, "10", orders10);
        clients.add(client10);

        for (Client client : clients) {
            System.out.println(client.toString());
        }
    }
}
