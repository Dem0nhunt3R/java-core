package lesson3.homework.clothes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L). Написати в ньому  метод getDescription.
//        Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.
//        2. Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".
//        3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум), вартість, колір.
//        4. Створити класи нащадки до класу Одяг - Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
//                Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг), Плаття (реалізує інтерфейс "Жіночий одяг"),
//                Галстук (реалізує інтерфейси Чоловічий одяг).
//        5. Створити клас Ательє, який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
//        та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор допоможе ->
//        if(a instanceof X){...})) та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).
        ArrayList<Clothes> clothesList = new ArrayList<>();
        Tshirt tshirt = new Tshirt();
        Trousers trousers = new Trousers();
        Dress dress = new Dress();
        Tie tie = new Tie();
        clothesList.add(tshirt);
        clothesList.add(trousers);
        clothesList.add(dress);
        clothesList.add(tie);
        Atelier atelier = new Atelier();
        atelier.setClothesList(clothesList);
        System.out.println(atelier.manChoice(clothesList));
        System.out.println(atelier.womanChoice(clothesList));

    }
}
