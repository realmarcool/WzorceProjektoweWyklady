package com.company.FabrykaAbstrakcyjna;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS button: -> Apple!");
    }
}
