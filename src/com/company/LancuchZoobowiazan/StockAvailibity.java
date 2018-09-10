package com.company.LancuchZoobowiazan;

import java.util.HashMap;
import java.util.Map;

public abstract class StockAvailibity {

    protected Map<String, Integer> products = new HashMap<>();
    protected StockAvailibity successor;
    abstract protected String getShopName();
    protected String name;
    protected int stock;

    abstract protected Map<String, Integer> products();

    public void setSuccessor(StockAvailibity successor){
        this.successor = successor;
    }

    public void processRequest(ShopItemPurchaseRequest request){
        products = products();request.getName();
        if (products.containsKey(request.getName())){
            int stock = products.get(request.getName());
            if (request.getStock() <= stock){
                System.out.println("kupione!" + getShopName());
            }else if (successor != null) {
                successor.processRequest(request);
            }
        }
        else if (successor != null) {
                successor.processRequest(request);
        }
    }

}
