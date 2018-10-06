package com.company.FabrykaAbstrakcyjna;

public class MacOSGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
