package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("name1", "lastname1", (byte) 72);
        userService.saveUser("name2", "lastname2", (byte) 71);
        userService.saveUser("name3", "lastname3", (byte) 50);
        userService.saveUser("name4", "lastname4", (byte) 38);

        for (User u: userService.getAllUsers()) {
            System.out.println(u);
        }

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
