package com.company.MetodaWytworcza.chocolate;

public class DarkChocolate extends Chocolate {

    public DarkChocolate() {
        super(ChocolateType.DARK);
    }

    @Override
    public String getDescription() {
        return "Czekolada gorzka";
    }

    @Override
    public void showChocolate() {
        showCacaoInfo(90);
        showSugarInfo(10);
    }
}