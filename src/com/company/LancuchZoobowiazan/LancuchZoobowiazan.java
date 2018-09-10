package com.company.LancuchZoobowiazan;

import java.util.Map;

public class LancuchZoobowiazan {
    public static void run(){


        ShopItemPurchaseRequest shopItemPurchaseRequest = new ShopItemPurchaseRequest("ajfon7", 1);
        SzczecinStockAvailibity szczecinStockAvailibity = new SzczecinStockAvailibity();
        CentralStockAvailibity centralStockAvailibity = new CentralStockAvailibity();
        FactoryStockAvailibity factoryStockAvailibity = new FactoryStockAvailibity();

        szczecinStockAvailibity.setSuccessor(centralStockAvailibity);
        centralStockAvailibity.setSuccessor(factoryStockAvailibity);

        szczecinStockAvailibity.processRequest(shopItemPurchaseRequest);

    }
}
