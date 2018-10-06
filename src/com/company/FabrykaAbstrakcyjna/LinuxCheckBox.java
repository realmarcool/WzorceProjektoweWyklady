package com.company.FabrykaAbstrakcyjna;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint(boolean isChecked) {
        System.out.println("Linux checkBox -> Linux: isChecked " +
                isChecked);
    }
}
