package com.company.Dekorator.gui;

public abstract class DecoratorWindow implements Window {

    private Window window;

    public DecoratorWindow(Window window) {
        this.window = window;
    }

    @Override
    public void rendererWindow() {
        window.rendererWindow();
    }
}
