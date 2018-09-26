package com.company.Most.another_example;

public class UserDB {
    public static void main(String[] args) {
        CRUDRepository<User> userCRUDRepository = new UserLocalRepository();
        UserService userService = new UserService(System.out, userCRUDRepository);
        User user1 = new User("1", "John", "1234", 1978);
        User user2 = new User("2", "Hanna", "password", 1992);
        User user3 = new User("3", "Stephen", "p@ssword", 1988);
        userService.addUserToService(user1);
        userService.addUserToService(user2);
        userService.addUserToService(user3);

        userService.showServiceUser();

        userService.deleteUserFromService(user1);

        userService.showServiceUser();
    }
}
