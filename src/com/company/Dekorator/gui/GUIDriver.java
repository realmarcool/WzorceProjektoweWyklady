package com.company.Dekorator.gui;


public class GUIDriver {

    public static void main(String[] args) {
        Window window = new BaseWindow();
        Window verticalScrollableWindow = new VerticalScrollableWindow(window);
        Window horizontalScrollableWindow = new HorizontalScrollableWindow(window);
        Window scrollableWindow = new VerticalScrollableWindow(new HorizontalScrollableWindow(window));
        System.out.println("-------------Base Window--------------------");
        window.rendererWindow();
        System.out.println("-------------Vertical Scrollable Window--------------------");
        verticalScrollableWindow.rendererWindow();
        System.out.println("-------------Horizontal Scrollable Window--------------------");
        horizontalScrollableWindow.rendererWindow();
        System.out.println("-------------Scrollable Window--------------------");
        scrollableWindow.rendererWindow();
    }
}