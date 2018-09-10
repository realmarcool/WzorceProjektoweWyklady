package com.company.LancuchZoobowiazan;

import java.util.HashMap;
import java.util.Map;

public class ShopItemPurchaseRequest {

    private String name;
    private int stock;

    public ShopItemPurchaseRequest(String name, int stock) {

        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}