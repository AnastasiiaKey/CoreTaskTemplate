package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user1 = new User("Fedor", "Doronin", (byte) 27);
        User user2 = new User("Ana", "Kochi", (byte) 25);
        User user3 = new User("Arseniy", "Kochi", (byte) 14);
        User user4 = new User("Larisa", "Doronina", (byte) 24);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User c именем " + user1.getName());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User c именем " + user2.getName());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User c именем " + user3.getName());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User c именем " + user4.getName());
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
