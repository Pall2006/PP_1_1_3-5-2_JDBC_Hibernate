package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;



public class Main {
    public static void main(String[] args)  {
        // Util.getConnection();
        UserService userService
                = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Павел", "Мартьянов", (byte) 42);
        userService.saveUser("Иван", "Морковкин", (byte) 8);
        userService.saveUser("Евгений", "Пуговкин", (byte) 24);
        userService.saveUser("Константин", "Петров", (byte) 20);
        userService.saveUser("Жора", "Копейкин", (byte) 60);
        userService.getAllUsers();
        userService.removeUserById(3);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}
