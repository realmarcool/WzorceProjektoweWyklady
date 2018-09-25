package com.company.LancuchZoobowiazan.cash_machine;

public class NoCashAvailable extends Withdrawal {
    @Override
    protected int getAvailableNumberOfNotes() {
        return 0;
    }

    @Override
    protected int getValue() {
        return 0;
    }

    @Override
    public Cash processRequest(CashRequest request, Cash cashToReturn) {
        cashToReturn.clear();
        return cashToReturn;
    }
}
