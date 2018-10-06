package com.company.FabrykaAbstrakcyjna;

public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
