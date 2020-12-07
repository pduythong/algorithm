package test.greenlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(10, "Z", 1, null, null));
        users.add(new User(2, "B", 2, null, null));
        users.add(new User(3, "y", 3, null, null));
        users.add(new User(4, "p", 4, null, null));
        users.add(new User(5, "E", 5, null, null));

        Collections.sort(users);


        users.forEach(System.out::println);


        System.out.println("--------------");

        Collections.sort(users, new CompareName());
        users.forEach(System.out::println);

    }

}
