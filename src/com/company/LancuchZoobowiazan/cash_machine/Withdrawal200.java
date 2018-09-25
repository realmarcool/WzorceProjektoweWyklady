package com.company.LancuchZoobowiazan.cash_machine;

public class Withdrawal200 extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 10;
    }

    @Override
    protected int getValue() {
        return 200;
    }
}