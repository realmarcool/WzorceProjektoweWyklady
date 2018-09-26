package com.company.Most.another_example;

public class UserLocalRepository extends LocalRepository<User> {

    @Override
    public String getRepositoryName() {
        return "User repository";
    }
}
