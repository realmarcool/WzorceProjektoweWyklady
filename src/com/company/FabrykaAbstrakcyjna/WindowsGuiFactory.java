package com.company.FabrykaAbstrakcyjna;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
