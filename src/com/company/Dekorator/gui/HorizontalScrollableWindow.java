package com.company.Dekorator.gui;

public class HorizontalScrollableWindow extends DecoratorWindow {

    public HorizontalScrollableWindow(Window window) {
        super(window);
    }

    @Override
    public void rendererWindow() {
        super.rendererWindow();
        System.out.println("Add horizontal scroll! -> rendering");
    }
}