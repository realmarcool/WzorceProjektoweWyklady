package com.company.LancuchZoobowiazan.cash_machine;

public abstract class Withdrawal {
    protected Withdrawal successor;

    abstract protected int getAvailableNumberOfNotes();

    abstract protected int getValue();

    public void setSuccessor(Withdrawal successor) {
        this.successor = successor;
    }

    public Cash processRequest(CashRequest request, Cash cashToReturn) {

        int numberOfNotes = request.getAmount()/getValue();
        if (numberOfNotes > getAvailableNumberOfNotes()) {
            numberOfNotes = getAvailableNumberOfNotes();
        }
        int cashDifference = request.getAmount() - numberOfNotes*getValue();
        if (numberOfNotes <= getAvailableNumberOfNotes() && cashDifference == 0){
            cashToReturn.addCash(numberOfNotes, getValue());
            return cashToReturn;
        }else if (successor != null){
            request.setAmount(cashDifference);
            cashToReturn.addCash(numberOfNotes, getValue());
            successor.processRequest(request, cashToReturn);
        }
        return cashToReturn;
    }
}
