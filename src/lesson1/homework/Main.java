package lesson1.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Client> clientsList = new ArrayList<>();

        ArrayList<String> orderList1 = new ArrayList<>();
        orderList1.add("order1");
        Client client1 = new Client(1, "Ali Baba1", 1234556789, "email@mail.com", orderList1);
        clientsList.add(client1);

        ArrayList<String> orderList2 = new ArrayList<>();
        orderList2.add("order2");
        Client client2 = new Client(2, "Ali Baba2", 1234556789, "email@mail.com", orderList2);
        clientsList.add(client2);

        ArrayList<String> orderList3 = new ArrayList<>();
        orderList3.add("order3");
        Client client3 = new Client(1, "Ali Baba3", 1234556789, "email@mail.com", orderList3);
        clientsList.add(client3);

        ArrayList<String> orderList4 = new ArrayList<>();
        orderList4.add("order4");
        Client client4 = new Client(4, "Ali Baba4", 1234556789, "email@mail.com", orderList4);
        clientsList.add(client4);

        ArrayList<String> orderList5 = new ArrayList<>();
        orderList5.add("order5");
        Client client5 = new Client(5, "Ali Baba5", 1234556789, "email@mail.com", orderList5);
        clientsList.add(client5);

        ArrayList<String> orderList6 = new ArrayList<>();
        orderList6.add("order6");
        Client client6 = new Client(6, "Ali Baba6", 1234556789, "email@mail.com", orderList6);
        clientsList.add(client6);

        ArrayList<String> orderList7 = new ArrayList<>();
        orderList7.add("order7");
        Client client7= new Client(7, "Ali Baba7", 1234556789, "email@mail.com", orderList7);
        clientsList.add(client7);

        ArrayList<String> orderList8 = new ArrayList<>();
        orderList8.add("order8");
        Client client8 = new Client(8, "Ali Baba8", 1234556789, "email@mail.com", orderList8);
        clientsList.add(client8);

        ArrayList<String> orderList9 = new ArrayList<>();
        orderList9.add("order1");
        Client client9 = new Client(9, "Ali Baba9", 1234556789, "email@mail.com", orderList9);
        clientsList.add(client9);

        ArrayList<String> orderList10 = new ArrayList<>();
        orderList10.add("order10");
        Client client10 = new Client(10, "Ali Baba10", 1234556789, "email@mail.com", orderList10);
        clientsList.add(client10);

        for (Client client : clientsList) {
            System.out.println(client);
        }
        ArrayList<Animal> animalList = new ArrayList<>();

        Animal animal1=new Animal("1",1,"type");
        animalList.add(animal1);
        Animal animal2=new Animal("2",1,"type");
        animalList.add(animal2);
        Animal animal3=new Animal("3",1,"type");
        animalList.add(animal3);
        Animal animal4=new Animal("4",1,"type");
        animalList.add(animal4);
        Animal animal5=new Animal("5",1,"type");
        animalList.add(animal5);
        Animal animal6=new Animal("6",1,"type");
        animalList.add(animal6);
        Animal animal7=new Animal("7",1,"type");
        animalList.add(animal7);
        Animal animal8=new Animal("8",1,"type");
        animalList.add(animal8);
        Animal animal9=new Animal("9",1,"type");
        animalList.add(animal9);
        Animal animal10=new Animal("10",1,"type");
        animalList.add(animal10);

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
        ArrayList<Book>booksList = new ArrayList<>();

        Book book1 = new Book("book1",100,"genre", "date");
        booksList.add(book1);
        Book book2 = new Book("book2",100,"genre", "date");
        booksList.add(book2);
        Book book3 = new Book("book3",100,"genre", "date");
        booksList.add(book3);
        Book book4 = new Book("book4",100,"genre", "date");
        booksList.add(book4);
        Book book5 = new Book("book5",100,"genre", "date");
        booksList.add(book5);
        Book book6 = new Book("book6",100,"genre", "date");
        booksList.add(book6);
        Book book7 = new Book("book7",100,"genre", "date");
        booksList.add(book7);
        Book book8 = new Book("book8",100,"genre", "date");
        booksList.add(book8);
        Book book9 = new Book("book9",100,"genre", "date");
        booksList.add(book9);
        Book book10 = new Book("book10",100,"genre", "date");
        booksList.add(book10);

        for (Book book : booksList) {
            System.out.println(book);
        }
    }
}
