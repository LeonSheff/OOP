package DZ6.homework;

import DZ6.homework.util.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        UserSaver.save(user);
    }
}