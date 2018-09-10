package com.company.LancuchZoobowiazan;

import java.util.Map;

public class CentralStockAvailibity extends StockAvailibity {
    @Override
    protected String getShopName() {
        return "magazyn centralny";
    }

    @Override
    protected Map<String, Integer> products() {
        products.put("ajfon6", 15);
        return products;
    }
}
