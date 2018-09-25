package com.company.LancuchZoobowiazan.cash_machine;

public class CashMachine {
    public static void main(String[] args) {
        Withdrawal withdrawal200 = new Withdrawal200();
        Withdrawal withdrawal100 = new Withdrawal100();
        Withdrawal withdrawal50 = new Withdrawal50();

        CashRequest cashRequest = new CashRequest(700);
        withdrawal200.setSuccessor(withdrawal100);
        withdrawal100.setSuccessor(withdrawal50);
        withdrawal50.setSuccessor(new NoCashAvailable());
        Cash cash = new Cash();
        cash = withdrawal200.processRequest(cashRequest, cash);
        cash.showCash();
    }
}
