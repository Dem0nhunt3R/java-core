package lesson1.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    private int id;
    private String nameAndSurname;
    private int phone;
    private String email;
    private ArrayList<String> orders = new ArrayList<>();

    public Client(){
    }

    public Client(int id, String nameAndSurname, int phone, String email, ArrayList<String> orders) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        this.phone = phone;
        this.email = email;
        this.orders = orders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }

    public ArrayList<String> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                '}';
    }
}
