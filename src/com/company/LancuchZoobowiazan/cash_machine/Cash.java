package com.company.LancuchZoobowiazan.cash_machine;

import java.util.HashMap;
import java.util.Map;

public class Cash {
    private Map<Integer, Integer> cash = new HashMap<>();

    public void addCash(int numberOfNotes, int value) {
        cash.put(numberOfNotes, value);
    }

    public void clear() {
        cash.clear();
    }

    public void showCash() {
        for (Map.Entry<Integer, Integer> entry : cash.entrySet()) {
            System.out.println(String.format(
                    "Wypłata: %dx%d", entry.getKey(), entry.getValue()));
        }
    }
}