package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl user = new UserServiceImpl();
        user.createUsersTable();
        user.saveUser("Иван", "Петров", (byte) 21);
        user.saveUser("Ирина", "Сидорова", (byte) 25);
        user.saveUser("Николай", "Иванов", (byte) 30);
        user.saveUser("Евгений", "Пименов", (byte) 24);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();

    }
}
