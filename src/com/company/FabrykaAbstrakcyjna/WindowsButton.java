package com.company.FabrykaAbstrakcyjna;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows button: -> Microsoft!");
    }
}
