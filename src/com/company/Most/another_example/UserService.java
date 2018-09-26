package com.company.Most.another_example;


import java.io.PrintStream;

public class UserService implements UserServiceAPI {

    private CRUDRepository<User> crudRepository;
    private PrintStream out;

    public UserService(PrintStream printStream, CRUDRepository<User> userCRUDRepository) {
        this.crudRepository = userCRUDRepository;
        this.out = printStream;
    }

    @Override
    public void addUserToService(User user) {
        crudRepository.add(user);
    }

    @Override
    public void deleteUserFromService(User user) {
        crudRepository.delete(user);
    }

    @Override
    public void showServiceUser() {
        for (User user : crudRepository.getList()) {
            out.println(user);
        }
    }
}
