package com.company.LancuchZoobowiazan;

import java.util.Map;

public class SzczecinStockAvailibity extends StockAvailibity {
    @Override
    protected String getShopName() {
        return "Szczecin";
    }

    @Override
    protected Map<String, Integer> products() {
        products.put("ajfon5", 10);
        return products;
    }

}
