package lesson4.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',
//                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

        HashSet<User> usersHashSet = new HashSet<>();
        TreeSet<User> usersTreeSet = new TreeSet<>();

        ArrayList<Skill> skillsList1 = new ArrayList<>();
        skillsList1.add(new Skill("js", 2.0));
        skillsList1.add(new Skill("js", 2.0));
        skillsList1.add(new Skill("js", 2.0));
        User user1 = new User(1, "name1", "surname", "email", Gender.MALE, skillsList1, new Car("model", 2000, 200));
        usersHashSet.add(user1);
        usersTreeSet.add(user1);

        ArrayList<Skill> skillsList2 = new ArrayList<>();
        skillsList2.add(new Skill("js", 2.0));
        skillsList2.add(new Skill("java", 1.0));
        User user2 = new User(2, "name2", "surname", "email", Gender.FEMALE, skillsList2, new Car("model", 2000, 200));
        usersHashSet.add(user2);
        usersTreeSet.add(user2);

        ArrayList<Skill> skillsList3 = new ArrayList<>();
        skillsList3.add(new Skill("js", 2.0));
        skillsList3.add(new Skill("js", 2.0));
        User user3 = new User(3, "name3", "surname", "email", Gender.MALE, skillsList3, new Car("model", 2000, 200));
        usersHashSet.add(user3);
        usersTreeSet.add(user3);

        ArrayList<Skill> skillsList4 = new ArrayList<>();
        skillsList4.add(new Skill("js", 2.0));
        skillsList4.add(new Skill("java", 1.0));
        User user4 = new User(4, "name4", "surname", "email", Gender.FEMALE, skillsList4, new Car("model", 2000, 200));
        usersHashSet.add(user4);
        usersTreeSet.add(user4);

        ArrayList<Skill> skillsList5 = new ArrayList<>();
        skillsList5.add(new Skill("js", 2.0));
        skillsList5.add(new Skill("js", 2.0));
        User user5 = new User(5, "name5", "surname", "email", Gender.MALE, skillsList5, new Car("model", 2000, 200));
        usersHashSet.add(user5);
        usersTreeSet.add(user5);

        ArrayList<Skill> skillsList6 = new ArrayList<>();
        skillsList6.add(new Skill("js", 2.0));
        skillsList6.add(new Skill("java", 1.0));
        User user6 = new User(6, "name6", "surname", "email", Gender.MALE, skillsList6, "model", 2000, 200);
        usersHashSet.add(user6);
        usersTreeSet.add(user6);

        ArrayList<Skill> skillsList7 = new ArrayList<>();
        skillsList7.add(new Skill("js", 2.0));
        skillsList7.add(new Skill("java", 1.0));
        User user7 = new User(7, "name7", "surname", "email", Gender.FEMALE, skillsList7, "model", 2000, 200);
        usersHashSet.add(user7);
        usersTreeSet.add(user7);

        ArrayList<Skill> skillsList8 = new ArrayList<>();
        skillsList8.add(new Skill("js", 2.0));
        skillsList8.add(new Skill("java", 1.0));
        User user8 = new User(8, "name8", "surname", "email", Gender.MALE, skillsList8, "model", 2000, 200);
        usersHashSet.add(user8);
        usersTreeSet.add(user8);

        ArrayList<Skill> skillsList9 = new ArrayList<>();
        skillsList9.add(new Skill("js", 2.0));
        skillsList9.add(new Skill("java", 1.0));
        User user9 = new User(9, "name9", "surname", "email", Gender.FEMALE, skillsList9, "model", 2000, 200);
        usersHashSet.add(user9);
        usersTreeSet.add(user9);

        ArrayList<Skill> skillsList11 = new ArrayList<>();
        skillsList11.add(new Skill("js", 2.0));
        skillsList11.add(new Skill("java", 1.0));
        User user11 = new User(11, "name11", "surname", "email", Gender.MALE, skillsList11, "model", 2000, 200);
        usersHashSet.add(user11);
        usersTreeSet.add(user11);

        usersHashSet.removeIf(next -> next.getGender().equals(Gender.MALE));

        for (User next : usersTreeSet) {
            System.out.println(next);
        }
    }
}
