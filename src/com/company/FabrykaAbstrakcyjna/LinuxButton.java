package com.company.FabrykaAbstrakcyjna;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Linux button: -> Linux!");
    }
}
