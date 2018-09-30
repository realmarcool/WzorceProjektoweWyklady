package com.company.MetodaSzablonowa;

public class TemplateMethod {
    public static void run() {
        ComputerSetup[] komputery = {new BasicComp(), new DeveloperComp()};
        for (ComputerSetup computer: komputery) {
            computer.computerBuild();
        }
    }
}
