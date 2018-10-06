package com.company.FabrykaAbstrakcyjna;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint(boolean isChecked) {
        System.out.println("Windows checkbox: -> Microsoft: is checked" + isChecked);
    }
}
