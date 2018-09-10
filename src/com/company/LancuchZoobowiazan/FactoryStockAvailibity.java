package com.company.LancuchZoobowiazan;

import java.util.Map;

public class FactoryStockAvailibity extends StockAvailibity {

        @Override
        protected String getShopName() {
            return "Factory";
        }

        @Override
        protected Map<String, Integer> products() {
            products.put("ajfon7", 100);
            return products;
        }
}
