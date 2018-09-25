package com.company.Dekorator.gui;

public class BaseWindow implements Window {
    @Override
    public void rendererWindow() {
        System.out.println("Base windows rendering");
    }
}